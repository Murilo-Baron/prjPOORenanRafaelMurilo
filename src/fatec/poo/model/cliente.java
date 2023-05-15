/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Murilo
 */
public class cliente {
    private double limiteCred;
    private double limiteDisp;

    public cliente(String nome, String cpf, double limiteCred) {
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
}
