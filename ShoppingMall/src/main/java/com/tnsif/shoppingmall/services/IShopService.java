package com.tnsif.shoppingmall.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnsif.shoppingmall.entity.Employee;
import com.tnsif.shoppingmall.entity.Item;
import com.tnsif.shoppingmall.entity.Shop;
import com.tnsif.shoppingmall.repository.IEmployeeRepository;
import com.tnsif.shoppingmall.repository.IItemRepository;
import com.tnsif.shoppingmall.repository.IShopRepository;

@Service
@Transactional
public class IShopService {
	@Autowired
    private IShopRepository shopRepository;

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private IItemRepository itemRepository;

    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop updateShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop searchShopById(int id) {
        Optional<Shop> result = shopRepository.findById(id);
        return result.orElse(null);
    }

    public boolean addEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee != null;
    }

    public boolean updateEmployee(Employee employee) {
        Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee != null;
    }

    public boolean deleteShop(int id) {
        if (shopRepository.existsById(id)) {
            shopRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
