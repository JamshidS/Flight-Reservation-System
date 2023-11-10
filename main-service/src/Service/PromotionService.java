package Service;

import model.Promotion;

public interface PromotionService {
    void createPromotion(Promotion promotion);
    Promotion getPromotionById(long promotionId);

}
