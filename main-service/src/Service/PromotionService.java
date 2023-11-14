package Service;

import model.Promotion;
import model.Ticket;

public interface PromotionService {
    String createPromotion(Promotion promotion);
    Promotion getPromotionById(long promotionId);
    void applyDiscountToUsersWithFourTicketsInMonth(int userId);
    void determineDiscountRate(Ticket ticket, int discountRate);

}
