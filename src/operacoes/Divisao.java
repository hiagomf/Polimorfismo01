/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import absctract.OperacaoMatematica;

/**
 *
 * @author Hiago
 */
public class Divisao extends OperacaoMatematica {

    @Override
    public double calcular(double x, double y) {
        return x / y;
    }

}
