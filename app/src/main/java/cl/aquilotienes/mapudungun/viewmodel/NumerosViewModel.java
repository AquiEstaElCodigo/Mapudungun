package cl.aquilotienes.mapudungun.viewmodel;

import androidx.lifecycle.ViewModel;

public class NumerosViewModel extends ViewModel {

    private int resultado;

    public NumerosViewModel(){}

    public int getResultado(){
        return resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }

}
