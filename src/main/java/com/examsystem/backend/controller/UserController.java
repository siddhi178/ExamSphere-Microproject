    package com.examsystem.backend.controller;

    import com.examsystem.backend.model.User;
    import com.examsystem.backend.repository.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/users")
    @CrossOrigin(origins = "*")
    public class UserController {

        @Autowired
        private UserRepository userRepository;

        @GetMapping
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        @PostMapping
        public User registerUser(@RequestBody User user) {
            if(user.getRole() == null) {
                user.setRole("STUDENT");
            }
            return userRepository.save(user);
        }

        @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
    }