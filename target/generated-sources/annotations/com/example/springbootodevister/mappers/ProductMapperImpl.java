package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.services.dtos.request.AddProductRequest;
import com.example.springbootodevister.services.dtos.response.AddProductResponse;
import com.example.springbootodevister.services.dtos.response.ListProductResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-16T12:03:40+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromAndRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( request.getName() );
        product.setUnitPrice( request.getUnitPrice() );
        product.setStock( request.getStock() );
        product.setStatement( request.getStatement() );

        return product;
    }

    @Override
    public AddProductResponse addResponseFromProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        AddProductResponse addProductResponse = new AddProductResponse();

        return addProductResponse;
    }

    @Override
    public List<ListProductResponse> listProductResponse(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ListProductResponse> list = new ArrayList<ListProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( productToListProductResponse( product ) );
        }

        return list;
    }

    protected ListProductResponse productToListProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ListProductResponse listProductResponse = new ListProductResponse();

        listProductResponse.setName( product.getName() );
        listProductResponse.setUnitPrice( product.getUnitPrice() );
        listProductResponse.setCategory( product.getCategory() );

        return listProductResponse;
    }
}
