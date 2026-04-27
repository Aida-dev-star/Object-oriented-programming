class Inventory {
    Product head = null;

    // Add product
    public void addProduct(int id, String name, int quantity, float price) {
        Product newProduct = new Product(id, name, quantity, price);

        if (head == null) {
            head = newProduct;
        } else {
            Product temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newProduct;
        }

        System.out.println("Product added.");
    }

    // Display products
    public void display() {
        Product temp = head;

        if (temp == null) {
            System.out.println("No products.");
            return;
        }

        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " $" + temp.price);
            temp = temp.next;
        }
    }

    // Search product
    public void search(int id) {
        Product temp = head;

        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Not found.");
    }

    // Update quantity
    public void update(int id, int qty) {
        Product temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = qty;
                System.out.println("Updated.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Product not found.");
    }

    // Delete product
    public void delete(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            System.out.println("Deleted.");
            return;
        }

        Product temp = head;

        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                System.out.println("Deleted.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Product not found.");
    }

    // Total value
    public void totalValue() {
        Product temp = head;
        float total = 0;

        while (temp != null) {
            total = total + (temp.quantity * temp.price);
            temp = temp.next;
        }

        System.out.println("Total value: $" + total);
    }
}