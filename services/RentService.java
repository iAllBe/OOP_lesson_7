package services;

import java.util.ArrayList;

import models.UserRequest;

public class RentService implements IRentService {

    public static ArrayList<UserRequest> requests;

    public RentService() {
        requests =  new ArrayList<>();
    }

    @Override
    public void ProcessRequest(UserRequest request) {
        requests.add(request);
    }

    @Override
    public void returnMovie(UserRequest request) {
        var user = request.getUser();
        int films =user.getFilms() - 1;
        user.setFilms((byte)films);
    }
    
}
