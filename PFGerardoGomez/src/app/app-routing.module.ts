import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewEducacionComponent } from './components/educacion/new-edcuacion.component'
import { EditEducacionComponent} from './components/educacion/edit-educacion.component';
import { NewProyectoComponent } from './components/proyectos/new-proyecto.component';
import { EditProyectoComponent } from './components/proyectos/edit-proyecto.component';
import { NewSkillComponent } from './components/Skill/new-skill.component';
import { EditSkillComponent } from './components/Skill/edit-skill.component';
import { EditPersonaComponent } from './components/acercade/edit-persona.component';



const routes: Routes = [
  {path:'',component: HomeComponent}, //cuando sea vacio que routee al componente home
  {path:'login',component: LoginComponent},
  {path:'nuevaexp',component: NewExperienciaComponent},
  {path:'editexp/id',component: EditExperienciaComponent},
  {path:'nuevaedu', component: NewEducacionComponent},
  {path:'editedu/:id', component:EditEducacionComponent}, 
  {path: 'nuevopro', component:NewProyectoComponent}, 
  {path: 'editpro/:id', component: EditProyectoComponent},
  {path: 'nuevaskill', component: NewSkillComponent}, 
  {path: 'editskill/:id', component: EditSkillComponent},
  {path: 'editar/:id', component: EditPersonaComponent}

  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
