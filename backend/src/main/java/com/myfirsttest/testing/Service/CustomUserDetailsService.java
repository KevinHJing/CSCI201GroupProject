//package com.myfirsttest.testing.Service;
//
//import java.util.*;
//
//import com.myfirsttest.testing.Repository.RoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import com.myfirsttest.testing.Model.User;
//import com.myfirsttest.testing.Repository.UserRepository;
//import com.myfirsttest.testing.Model.Role;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    private final UserRepository userRepository;
//    @Autowired
//    private final RoleRepository roleRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//
//    //find by email
//    public User getUserByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }
//
//    //saves the user to database
//    public void updateUser(User user) {
//        //encript password
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        //user.setEnabled(true);
//        Role userRole = roleRepository.findByRole("ADMIN");
//        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
//        userRepository.save(user);
//    }
//
//    //finds all users
//    public List<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//
//    //deletes user
//    public void deleteUser(String id){
//        userRepository.deleteById(id);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(email);
//        if(user != null) {
//            List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
//            return buildUserForAuthentication(user, authorities);
//        } else {
//            throw new UsernameNotFoundException("username not found");
//        }
//    }
//
//    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
//        Set<GrantedAuthority> roles = new HashSet<>();
//        userRoles.forEach((role) -> {
//            roles.add(new SimpleGrantedAuthority(role.getRole()));
//        });
//
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
//        return grantedAuthorities;
//    }
//
//    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
//    }
//
//}
//
///*
//public void updateUser(User user){
//        User savedUser = userRepository.findById(user.getId())
//                .orElseThrow(() -> new RuntimeException(
//                        String.format("Cannot Find User by ID %s", user.getId())));
//        savedUser.setPassword(user.getPassword());
//        savedUser.setUsername(user.getUsername());
//        savedUser.setEmail(user.getEmail());
//        savedUser.setFname(user.getFname());
//        savedUser.setLname(user.getLname());
//        savedUser.setAge(user.getAge());
//        savedUser.setDriversLicense(user.getDriversLicense());
//        savedUser.setLikedListings(user.getLikedListings());
//
//        userRepository.save(savedUser);
//    }
// */