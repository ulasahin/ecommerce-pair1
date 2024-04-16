package com.example.springbootodevister.services.concretes;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.mappers.ProductMapper;
import com.example.springbootodevister.repository.ProductRepository;
import com.example.springbootodevister.services.abstracts.ProductService;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddProductResponse;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public AddProductResponse add(AddProductRequest request) {
        sameWithNoExit(request.getName());
        Product product = ProductMapper.INSTANCE.productFromAndRequest(request);
        product = productRepository.save(product);
        AddProductResponse addProductResponse = ProductMapper.INSTANCE.addResponseFromProduct(product);
        return addProductResponse;
    }

    @Override
    public List<ListProductResponse> getAll() {
        List<Product> product = productRepository.findAll();
       List<ListProductResponse> lProductResponses = ProductMapper.INSTANCE.listProductResponse(product);
       return lProductResponses;
    }

    @Override
    public List<ListProductResponse> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    @Override
    public List<ListProductResponse> searchByUnitPrice(int minPrice, int maxPrice) {
       return null;
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        Product product = getById(id);
        productRepository.delete(product);
    }

    @Override
    public Product getById(int id) {
        return productRepository.findById(id).orElseThrow();
    }


    private void sameWithNoExit(String name){
        Optional<Product> productOptional = productRepository.findByName(name);
        if(productOptional.isPresent()){
            throw new RuntimeException("Aynı isimde kategori bulunamaz");
        }
    }
}
