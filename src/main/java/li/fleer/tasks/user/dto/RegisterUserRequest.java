package li.fleer.tasks.user.dto;

public record RegisterUserRequest(
        String email,
        String password) {
}