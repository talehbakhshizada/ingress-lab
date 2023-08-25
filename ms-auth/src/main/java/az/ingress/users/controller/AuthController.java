package az.ingress.users.controller;

import az.ingress.users.model.request.LoginRequest;
import az.ingress.users.model.request.SignUpRequest;
import az.ingress.users.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class AuthController {

    AuthService authService;

    @PostMapping("/sign-in")
    public ResponseEntity<String> signIn(@RequestBody LoginRequest loginRequest) {
        authService.signIn(loginRequest);
        return new ResponseEntity<>("Logged in successfully ", OK);
    }

    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody SignUpRequest signUpRequest) {

        authService.signUp(signUpRequest);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }

}
