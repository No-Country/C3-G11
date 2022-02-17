package ecommerce.g11.noCountry.controller;

import ecommerce.g11.noCountry.entidades.Role;
import ecommerce.g11.noCountry.servicios.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/santero/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Role role){

        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(roleService.save(role));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al intentar guardar");
        }

    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(roleService.getAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al recuperar roles");
        }
    }
}
