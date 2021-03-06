package com.CPR.redHome.mapper.admin.product;

import com.CPR.redHome.dto.product.ProductDto;
import com.CPR.redHome.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface ProductAdminMapper {
    // paging 위한 totalcnt
    int selectTotalCnt(@Param("criteria") Criteria criteria);

    // 상품 조회
    List<ProductDto> selectProducts(@Param("firstRecordIndex") int firstRecordIndex, @Param("criteria") Criteria criteria);

    // productId로 상품 조회
    ProductDto selectProductByProductId(Long productId);

    // 상품 update
    void updateProduct(ProductDto productDto);

    // 상품 delete
    void deleteProduct(Long productId);

    // 가격대 별 상품 수
    LinkedHashMap<String, Integer>  selectProductByPrice();

    // 카테고리 별 상품 수
    LinkedHashMap<String, Integer> selectProductByCategory();

    // 테마 별 상품 수
    LinkedHashMap<String, Integer> selectProductByTheme();
}
