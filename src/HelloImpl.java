/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.rmi.RemoteException;

public class HelloImpl implements RemoteHello {

    private String mensagem;

    public HelloImpl() throws RemoteException {
        this("Inicial");
    }

    public HelloImpl(String mensagem) throws RemoteException {
        setMensagem(mensagem);
    }

    public String getMensagem() throws RemoteException {
        return mensagem;
    }

    public void setMensagem(String mensagem) throws RemoteException {
        this.mensagem = mensagem;
    }
}
