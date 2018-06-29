/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dragonet.api.logger;

public interface IProxyLogger {

    public abstract void setDebug(boolean debug);

    public abstract void setColorFull(boolean colorful);

    public abstract void info(String message);

    public abstract void warning(String message);

    public abstract void severe(String message);

    public abstract void debug(String message);

    public abstract void stop();
}
