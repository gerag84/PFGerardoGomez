export class Educacion {
    id? : number;
    nombreEd : string;
    descripcionEd : string;
    estadoEd : string;

    constructor(nombreEd: string, descripcionEd: string, estadoEd: string){
        this.nombreEd = nombreEd;
        this.descripcionEd = descripcionEd;
        this.estadoEd = estadoEd;
    }
}
