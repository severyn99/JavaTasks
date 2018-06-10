from stuff.Boat import *
from stuff.CampCooler import *
from stuff.CampingClothes import *
from stuff.CampStove import *
from stuff.Cauldron import *
from stuff.SleepingBag import *
from stuff.SleepingPad import *
from stuff.Tent import *
from ShopManager import *
from enums.SidesType import *
from enums.StuffType import *

if __name__ == '__main__':
    shopManager = ShopManager()

    boat = Boat("Expeditor", "INTEX", 5000, "rubber", 500.54, 8)
    camp_cooler = CampCooler("Frost", "Alaska", 1500, "plastik", 200.0, 2.5, SidesType.HARDSIDED)
    camping_clothes = CampingClothes("Jacket", 50.5, "fafa", "leather", 300, "M")
    camp_stove = CampStove("Heater", "Warior", 2500, "metal", 120.30, 3.3, 2.2)
    cauldron = Cauldron("Wiccan", "MealWorkers", 2000, "iron", 80.50, 3.2)
    sleeping_bag = SleepingBag("Dreamer", "Bergson", 1500, "wool", 100.0, "M", "white")
    sleeping_pad = SleepingPad("Helper", "SoftDreams", 300, "rubber", 50.0, "pink", 1.2)
    tent = Tent("Camper", "4F", 6500, "nylon", 240.55, "black", 6)

    shopManager.goods = [boat, camp_cooler, camping_clothes, camp_stove, cauldron, sleeping_bag, sleeping_pad, tent]
    print("Initial list:")
    shopManager.print_list()

    shopManager.sort_by_weight()
    print("Sorted list")
    shopManager.print_list()

    shopManager.goods = shopManager.find_by_type(StuffType.TENT)
    print("Found list:")
    shopManager.print_list()

    pass
