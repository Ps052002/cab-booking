public class userbookinghistory {
    String booking_id,car_id,price_per_day,start_date,end_date,no_of_days,rent,security,name,mobile,address,email,payment_status,booking_status;
    
    public userbookinghistory(String booking_id,String car_id,String price_per_day,String start_date,String end_date,String no_of_days,String rent,String security,String name,String mobile,String address,String email,String payment_status,String booking_status){
        this.booking_id=booking_id;
        this.car_id=car_id;
        this.price_per_day=price_per_day;
        this.start_date=start_date;
        this.end_date=end_date;
        this.no_of_days=no_of_days;
        this.rent=rent;
        this.security=security;
        this.name=name;
        this.mobile=mobile;
        this.address=address;
        this.email=email;
        this.payment_status=payment_status;
        this.booking_status=booking_status;
       
    }

}

