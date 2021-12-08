package pe.jccallo.themouseapp;

import androidx.fragment.app.Fragment;

public interface NavigationHost {
    /*
     *  Disparador de navegacion hacia un fragmento especifico
     */
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
