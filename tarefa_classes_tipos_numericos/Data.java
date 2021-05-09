public class Data{
    private int ano;
    private int mes;
    private int dia;

    public Data(){
        this.ano = 1999;
        this.mes = 1;
        this.dia = 31;
    }

    public Data(int dia, int mes, int ano){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }



    // PropriedadesMeses meses = new PropriedadesMeses(2018);
            
    // System.out.println(meses.listaDeMeses.get(2));

    public Data diaSeguinte(int dia, int mes, int ano){
        PropriedadesMeses meses = new PropriedadesMeses(ano);
        int diaSeguinte=0;
        
        if (meses.listaDeMeses.get(mes).getQuantidadeDias() == dia){
            diaSeguinte=1;
            mes++;  
            ano++;
        }else{
            diaSeguinte = ++dia;
        } 
        mes = mes == 13 ? 1 : mes;
        
        return new Data(diaSeguinte,mes,ano);
    }

    public void diaAnterior(){

    }

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}


    @Override
    public String toString(){
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }

}