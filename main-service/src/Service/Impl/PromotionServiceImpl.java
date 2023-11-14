package Service.Impl;

import Service.PromotionService;
import model.Passenger;
import model.Promotion;
import model.Ticket;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PromotionServiceImpl implements PromotionService {
    private List<Promotion> promotionList = new ArrayList<>();
    private UserService userService;

    public PromotionServiceImpl(UserService userService){
        this.userService = userService;
    }

    @Override
    public String createPromotion(Promotion promotion) {
        promotionList.add(promotion);
        return "Promotion has been created. Promotion id : " + promotion.getPromotionId() ;
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

    @Override
    public void applyDiscountToUsersWithFourTicketsInMonth(int userId) {
        User user = userService.getUserById(userId);
        if (user.getPassangers().size() == 4) {
            int discountRate = 10;
            for (Passenger passenger: user.getPassangers()) {
                applyDiscountToTicket(passenger.getTicket(), discountRate);
            }

        }
    }

    @Override
    public void determineDiscountRate(Ticket ticket, int discountRate) {
        LocalDate currentDate = LocalDate.now();
        for (Promotion promotion : promotionList) {
            if (currentDate.isAfter(promotion.getStartDate()) && currentDate.isBefore(promotion.getEndDate())) {
                applyDiscountToTicket(ticket, promotion.getDiscountRate());
            }
        }
    }


    private void applyDiscountToTicket(Ticket ticket, int discountRate) {
        double originalPrice = ticket.getPrice();
        double discount = originalPrice * (discountRate / 100.0);
        double discountedPrice = originalPrice - discount;
        ticket.setPrice(discountedPrice);
    }



}
