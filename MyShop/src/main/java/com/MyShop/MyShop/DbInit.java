package com.MyShop.MyShop;

import com.MyShop.MyShop.model.Item;
import com.MyShop.MyShop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {
    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
            new Item("Olowek", new BigDecimal(1.50), "https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"),
            new Item("Olowek", new BigDecimal(1.50), "https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"),
            new Item("Olowek", new BigDecimal(1.50), "https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg")
        ));
    }
}
