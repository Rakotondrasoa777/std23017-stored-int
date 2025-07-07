package com.poja.exam.endpoint.rest.controller.storedint;

import com.poja.exam.service.StoreIntService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
    private StoreIntService storeIntService;

    @GetMapping("/stored-int")
    public int getStoredInd() {
        return storeIntService.getStoredInt();
    }
}
