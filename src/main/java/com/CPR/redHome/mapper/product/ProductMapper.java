package com.CPR.redHome.mapper.product;

import com.CPR.redHome.dto.cart.CartDto;
import com.CPR.redHome.dto.product.ProductImageDto;
import com.CPR.redHome.dto.product.ProductViewDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ProductMapper {

    //특정 제품 정보 가져오기
    ProductViewDto selectProduct(Long productId);

    //특정 제품 이미지 가져오기
    List<ProductImageDto> selectProductImgList(Long productId);

    //제품리스트 가져오기
    List<ProductViewDto> selectProductList(@Param("storeOrder") String storeOrder, @Param("deliveryChargeOPtion") String deliveryChargeOPtion,
                                           @Param("searchProductKeyword") String searchProductKeyword, @Param("productThemeNo") Integer productThemeNo);

    //판매자 제품리스트 가져오기
    List<ProductViewDto> selectSellerList(@RequestParam String storeOrder, @RequestParam String deliveryChargeOPtion,
                                           @RequestParam String searchProductKeyword, @RequestParam Integer productThemeNo, Long memberId);


    //제품 장바구니에 넣기
    void insertProductToCart(CartDto cartDto);

    //특정 제품에 대한 가장 최근 장바구니 번호 가져오기
    Long selectShoppingCartNo(Long productId);

}
