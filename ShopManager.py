class ShopManager:
    goods = []

    def __init__(self):
        pass

    def sort_by_weight(self):
        self.goods.sort(key=lambda stuff: stuff.weight)

    def find_by_type(self, stuff_type):
        found_stuff = []

        for stuff in self.goods:
            if stuff.stuff_type == stuff_type:
                found_stuff.append(stuff)

        return found_stuff

    def add_toy(self, stuff):
        self.goods += stuff

    def print_list(self):
        for stuff in self.goods:
            print(stuff)
        print("\n")

