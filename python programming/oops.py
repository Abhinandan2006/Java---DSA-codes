'''class Vehicle:
    def __init__(self, milege, fuel_left):
        self.milege = milege
        self.fuel_left = fuel_left
        self.reserve = 5

    def identify_distance_that_can_be_travelled(self):
        if self.fuel_left > self.reserve:
            d = (self.fuel_left - self.reserve) * self.milege
            return d
        return 0

    def identify_distance_travelled(self, initial_fuel):
        return (initial_fuel - self.fuel_left) * self.milege

car1 = Vehicle(24, 100)

print(car1.identify_distance_that_can_be_travelled())
print(car1.identify_distance_travelled(60))'''

class shoe:
    def __init__(self, price, material):
        self.price = price
        self.material = material
    def __str__(self):
        return "shoe with price" + str(self.price) + "and material" + self.material

s1 = shoe(50, 60)
