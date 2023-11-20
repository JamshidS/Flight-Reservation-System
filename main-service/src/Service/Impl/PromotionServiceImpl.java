package Service.Impl;

import Service.PromotionService;
import model.Promotion;

import java.util.ArrayList;
import java.util.List;

public class PromotionServiceImpl implements PromotionService {
    private List<Promotion> promotionList = new ArrayList<>();
    @Override
    public void createPromotion(Promotion promotion) {
        promotionList.add(promotion);
    }

    @Override
    public Promotion getPromotionById(long promotionId) {
        for (Promotion promotion : promotionList){
            if (promotion.getPromotionId() == promotionId){
                return promotion;
            }
        }
        return null;
    }
}
