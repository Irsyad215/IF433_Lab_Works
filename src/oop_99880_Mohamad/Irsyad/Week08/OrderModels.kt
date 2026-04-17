package oop_99880_Mohamad.Irsyad.Week08

class city(val name: String)
class adress(val city: city?)
class DeliveryDetails(val adress: adress?)
class Order(val deliveryDetails: DeliveryDetails?, val totalprice: Int)