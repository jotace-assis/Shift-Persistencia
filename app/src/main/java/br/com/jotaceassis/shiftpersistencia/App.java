package br.com.jotaceassis.shiftpersistencia;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.orhanobut.hawk.Hawk;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        Hawk.init(this).build();
    }
}
