package li.fleer.tasks.user;

import li.fleer.tasks.user.dto.RegisterUserRequest;
import li.fleer.tasks.user.dto.UserDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
class UserController {

    @PostMapping("/register")
    public UserDto registerUser(@RequestBody RegisterUserRequest req) {
        return new UserDto(req.email());
    }

}
