package services;

import models.UserRequest;

public interface IRentService {
    void ProcessRequest(UserRequest request);   
    void returnMovie(UserRequest request); 
}
