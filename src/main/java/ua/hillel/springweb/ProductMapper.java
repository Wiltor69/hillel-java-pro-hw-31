package ua.hillel.springweb;

public interface ProductMapper {

    Product ProductDTOToProduct(ProductDTO productDTO);
    ProductDTO ProductToProductDTO(Product product);
}
