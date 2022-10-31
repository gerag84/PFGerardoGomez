import { Component, OnInit } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-edit-persona',
  templateUrl: './edit-persona.component.html',
  styleUrls: ['./edit-persona.component.css']
})
export class EditPersonaComponent implements OnInit {
  //pers: persona = null;
  pers: persona = new persona("","","","","");
  public archivos: any = [];

  constructor(private sPersona: PersonaService, private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.sPersona.getPersona().subscribe(data => {this.pers = data})
    const id = this.activatedRouter.snapshot.params['id'];
    /*this.sPersona.detail(id).subscribe(
      data =>{
        this.pers = data;
      }, err =>{
        alert("Error al modificar perfil");
        this.router.navigate(['']);
      }
    )*/
  }

  onUpdate(): void{
    const formularioDatos = new FormData();
    formularioDatos.append('files', this.archivos)

    this.sPersona.getPersona().subscribe(data => {this.pers = data})
    const id = this.activatedRouter.snapshot.params['id'];
    this.sPersona.update(id, this.pers).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar perfil");
         this.router.navigate(['']);
      }
    )
  }

  capturarFile(event:any): any{
    const archivoCapturado = event.target.files[0];
    this.archivos.push(archivoCapturado);

    //console.log(event.target.files);
  }
}
