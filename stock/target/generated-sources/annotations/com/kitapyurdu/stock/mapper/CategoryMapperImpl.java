package com.kitapyurdu.stock.mapper;

import com.kitapyurdu.stock.dto.CategoryDto;
import com.kitapyurdu.stock.dto.ProductDto;
import com.kitapyurdu.stock.entity.Category;
import com.kitapyurdu.stock.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-09T23:00:08+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toResource(Category e) {
        if ( e == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.categoryId = e.getCategoryId();
        categoryDto.categoryName = e.getCategoryName();
        categoryDto.categoryDescription = e.getCategoryDescription();
        categoryDto.productList = productListToProductDtoList( e.getProductList() );

        return categoryDto;
    }

    @Override
    public Category toEntity(CategoryDto r) {
        if ( r == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( r.categoryId );
        category.setCategoryName( r.categoryName );
        category.setCategoryDescription( r.categoryDescription );
        category.setProductList( productDtoListToProductList( r.productList ) );

        return category;
    }

    @Override
    public List<CategoryDto> toResource(List<Category> eList) {
        if ( eList == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( eList.size() );
        for ( Category category : eList ) {
            list.add( toResource( category ) );
        }

        return list;
    }

    @Override
    public List<Category> toEntity(List<CategoryDto> rList) {
        if ( rList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( rList.size() );
        for ( CategoryDto categoryDto : rList ) {
            list.add( toEntity( categoryDto ) );
        }

        return list;
    }

    protected ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.productId = product.getProductId();
        productDto.productName = product.getProductName();
        productDto.productDescprition = product.getProductDescprition();
        productDto.productAmount = product.getProductAmount();
        productDto.productStockInformation = product.getProductStockInformation();

        return productDto;
    }

    protected List<ProductDto> productListToProductDtoList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductDto> list1 = new ArrayList<ProductDto>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProductDto( product ) );
        }

        return list1;
    }

    protected Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productDto.productId );
        product.setProductName( productDto.productName );
        product.setProductDescprition( productDto.productDescprition );
        product.setProductAmount( productDto.productAmount );
        product.setProductStockInformation( productDto.productStockInformation );

        return product;
    }

    protected List<Product> productDtoListToProductList(List<ProductDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductDto productDto : list ) {
            list1.add( productDtoToProduct( productDto ) );
        }

        return list1;
    }
}
