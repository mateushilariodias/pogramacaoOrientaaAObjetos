class FormaGeometrica {
    #base
    #altura
    #tipo

    constructor(base, altura, tipo){
        this.#base = base
        this.#altura = altura
        this.#tipo = tipo
    }

    get base(){
        return this.#base
    }
    get altura(){
        return this.#altura
    }
    get tipo(){
        return this.#tipo
    }

    set base(valor){

        if(typeof valor !== 'number' || valor <= 0){
            throw new Error('ERRO: a base precisa ser numérica e maior que zero')
        }
        this.#base = valor
    }
    

    set    
}