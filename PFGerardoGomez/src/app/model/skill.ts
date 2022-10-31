export class Skill {
    id? : number;
    nombreS : string;
    porcentajeS : number;

    constructor(nombreS: string, porcentajeS: string){
        this.nombreS = nombreS;
        this.porcentajeS = parseInt(porcentajeS);
    }
}
