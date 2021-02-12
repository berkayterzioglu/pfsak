/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.net.terzioglu.pfsak.module;

/**
 *
 * @author Merhabalarr
 */
public abstract class ConfigBase {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

    public abstract ConfigBase getInverse();

}
