package controllers;

import java.util.ArrayList;

import models.Role;
import models.User;
import services.IFilmService;
import services.IRentService;
import services.RentService;
import views.MainView;

public class NeflixController {
    IRentService rentSrv;
    IFilmService filmSrv;
    MainView view;
    private User user;

    public NeflixController() {
        view = new MainView();
    }    

    public void Run(){
        var name = view.authorize();
        if(isAdmin(name))
            adminMenu();
        else
            userMenu();
    }
    
    private void userMenu() {
        var num = view.showUserMenu();
        var ctrl = new UserController(user, new RentService());
        ctrl.Run(num);
    }

    private void adminMenu(){
        var num = view.showAdminMenu();
    }

    private boolean isAdmin(String name){
        var list = getUsers();
        for (User user : list) {
            if(user.getName().equals(name))
            {
                this.user = user;
                return user.getRole().equals(Role.admin);
            }
        }
        throw new NullPointerException("Пользователь не найден");
    }

    private ArrayList<User> getUsers(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Admin", Role.admin, 9999999, (byte)0));
        list.add(new User("User", Role.user, 100, (byte)0));
        return list;
    }
}
