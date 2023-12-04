package Run;

import business.entity.Catalog;
import business.entity.Product;
import business.entity.User;
import business.service.ICatologService;
import business.service.IProductService;
import business.service.IUserService;
import business.serviceImpl.CatalogServiceimpl;
import business.serviceImpl.ProductServiceimpl;
import business.serviceImpl.UserServiceImpl;
import business.util.InputMethods;

import java.util.List;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class StoreManagement {
    private static final IProductService productService = new ProductServiceimpl();
    private static final ICatologService catalogService = new CatalogServiceimpl();
    private static final IUserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        do {
            System.out.println("------Quản lý úng dụng------");
            System.out.println("1. Đăng ký ");
            System.out.println("2. Đăng nhập ");
            System.out.println("0. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    getRegister();
                    break;
                case 2:
                    getLogIn();
                    break;
                case 0:
                    System.err.println("Thoát chương trình");
                    System.exit(0);
                    break;
            }
        } while (true);


    }

    //dang nhap
    private static void getLogIn() {
        System.out.println("Username:");
        String tk = InputMethods.getString();
        System.out.println("Password:");
        String mk = InputMethods.getString();
        boolean check = userService.checkLogIn(tk, mk);
        if (check) {
            managerment();
        } else System.out.println("Tài khoản hoặc Mật khẩu chưa đúng");
    }

    //dang ki
    private static void getRegister() {
        System.out.println("Hãy nhập tài khoản của bạn");
        String userName = InputMethods.getString();
        System.out.println("Hãy nhập mật khẩu của bạn");
        String userPassword = InputMethods.getString();
        User user = new User(userService.getNewId(), userName, userPassword, true);
        userService.creatUser(user);
        System.out.println("Tạo tài khoản thành công");
    }

    private static void managerment() {
        // hiển thị menu chức năng
        boolean flag = true;
        do {
            System.out.println("--------- Menu chức năng ----------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("3. Quản lí tài khoản");
            System.out.println("0. Thoát menu chức năng");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // điều hướng menu Quản lí dnah mục
                    menuCatalog();
                    break;
                case 2:
                    // điều hướng menu Quản lí sản phẩm
                    menuProduct();
                    break;
                case 3:
                    menuUser();
                    break;
                case 0:
                    // thoát
                    System.out.println("Thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        } while (flag);
    }

    //xu ly chuc nang user
    private static void menuUser() {
        boolean flag = true;
        do {
            System.out.println("1. Hiển thị danh sách tài khoản");
            System.out.println("0. Thoát menu quản lý tài khoản");
            System.out.println("Hãy nhập lựa chọn của bạn");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    userService.displayUser(userService.findAllSortByName());
                    break;
                case 0:
                    System.out.println("Thoát menu quản lý tài khoản");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    // xử li các chức năng của danh mục
    public static void menuCatalog() {
        boolean flag = true;
        do {
            System.out.println("--------- Menu chức năng quản lý danh mục ----------");
            System.out.println("1. Hiển thị danh sách danh mục");
            System.out.println("2. Tạo mới danh mục");
            System.out.println("3. Tìm kiếm danh mục theo tên");
            System.out.println("4. Chỉnh sửa thông tin danh mục");
            System.out.println("5. Ẩn/hiện danh mục theo mã danh mục");
            System.out.println("6. Ẩn/hiện nhiều danh mục theo mã danh mục");
            System.out.println("0. Thoát menu quản lý danh mục");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1: // Hien thi danh sach danh muc
                    displayCatalog(catalogService.findAllOrderSortByCreatedDate());
                    break;
                case 2: // Tao moi danh muc
                    addNewCatalog();
                    break;
                case 3: // Tim kiem danh muc theo ten
                    findCatalogByName();
                    break;
                case 4: // Chinh sua thong tim danh muc
                    editCatalog();
                    break;
                case 5: // An hien danh muc
                    updateCatalogStatus();
                    break;
                case 6: //an nhieu danh muc
                    hideCatalogs();
                    break;
                case 0:
                    // thoát
                    System.out.println("Thoát menu Qly danh mục");
                    flag = false;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        } while (flag);
    }

    //an nhieu danh muc
    private static void hideCatalogs() {
        System.out.println("Hãy nhập vào các mã danh mục ");
        String idArray = InputMethods.getString();
        String[] ids = idArray.split(",");
        for (int i = 0; i < ids.length; i++) {
            Long id = Long.parseLong(ids[i].trim());
            Catalog catalogEdit = catalogService.findById(id);
            if (catalogEdit.isStatus()) {
                catalogEdit.setStatus(false);
            } else catalogEdit.setStatus(true);

        }

    }

    public static void displayCatalog(List<Catalog> catalogs) {
        if (catalogs.isEmpty()) {
            System.err.println("Danh sách dang mục đang trống");
        } else catalogs.forEach(System.out::println);
    }

    private static void addNewCatalog() {
        Long newid = catalogService.getNewId();
//        System.out.println("Hãy nhập vào tên danh muc");
//        String catalogName = InputMethods.getString();
        String catalogName = getCatalogName();
        System.out.println("Hãy nhập vào mô tả danh muc");
        String description = InputMethods.getString();
        System.out.println("Hãy nhập vào trạng thái danh muc(true,false)");
        boolean status = InputMethods.getBoolean();
        Catalog catalog = new Catalog(newid, catalogName, description, LocalDateTime.now(), status);
        catalogService.creatCatalog(catalog);
        System.out.println("Đã thêm danh mục thành công");
    }

    private static void updateCatalogStatus() {
        // bắt người dùng nhập id cần sửa
        System.out.println("Hãy nhập mã danh mục cần sửa");
        Long idEdit = InputMethods.getLong();
        Catalog catalogEdit = catalogService.findById(idEdit);
        if (catalogEdit == null) {
            System.err.println("Không tìm thấy danh mục phù hợp ");
            return;
        }
        // hiển thị giá trị cũ
        System.out.println("--------Thông tin sanh mục trước khi sửa là ----------");
        System.out.println(catalogEdit);
        // edit va hiển thi giá trị sau khi edit
        if (catalogEdit.isStatus()) {
            catalogEdit.setStatus(false);
        } else catalogEdit.setStatus(true);
        System.out.println("--------Thông tin danh mục sau khi sửa là ----------");
        System.out.println(catalogEdit);

    }

    private static void editCatalog() {
        System.out.println("Hãy nhập vào Id danh mục cần sửa");
        Long catalogIdEdit = InputMethods.getLong();
        Catalog catalogEdit = catalogService.findById(catalogIdEdit);
        if (catalogEdit == null) {
            System.err.println("Không tìm thấy danh mục");
            return;
        }
//hien thi gia tri cu
        System.out.println("------Thông tin danh mục cần sửa-------");
        System.out.println(catalogEdit);
        System.out.println("Hãy nhập giá trị mới");
//nhap vao cac thong tin cho danh muc moi
        System.out.println("Hãy nhập vào tên mới cho danh muc");
        catalogEdit.setCatalogName(InputMethods.getString());
        System.out.println("Hãy nhập vào mô tả mới cho danh muc");
        catalogEdit.setDescription(InputMethods.getString());
        // gọi service để update danh mục
        catalogService.updateCatalog(catalogEdit);
        System.out.println("Cập nhật thành công");
    }

    private static void findCatalogByName() {
        System.out.println("Nhập tên danh mục cần tìm kiếm");
        String findCatalogName = InputMethods.getString();
        List<Catalog> catalogs = catalogService.findCatalogByName(findCatalogName);
        displayCatalog(catalogs);
    }


    // xử lí các chức năng của sản phẩm
    public static void menuProduct() {
        boolean flag = true;
        do {

            System.out.println("--------- Menu chức năng quản lý sản phẩm ----------");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Tạo mới một hoặc nhiều sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Chỉnh sửa thông tin sản phẩm");
            System.out.println("5. Ẩn/hiện sản phẩm theo mã");
            System.out.println("6. Ẩn/hiện nhiều sản phẩm theo mã");
            System.out.println("0. Thoát menu quản lý sản phẩm");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1: // Hien thi danh sach san pham
                    System.out.println("1.Hiển thị theo giá sản phẩm");
                    System.out.println("2.Hiển thị theo ngày tạo sản phẩm");
                    System.out.println("Hãy nhập lựa chọn của bạn");
                    int choice1 = InputMethods.getInteger();
                    if (choice1 == 1) {
                        displayListProduct(productService.findAllSortByPrice());
                        break;
                    } else if (choice1 == 2) {
                        displayListProduct(productService.findAllSortByCreatTime());
                        break;
                    } else break;
                case 2: // Them moi san pham
                    addProduct();
                    break;

                case 3: // Tim kiem san pham theo ten
                    System.out.println("Hãy nhập tên sản phẩm cần tìm");
                    String name = InputMethods.getString();
                    findProductByName(name);
                    break;
                case 4: // Chinh sua thong tin san pham
                    updateProduct();
                    break;
                case 5: // An hien san pham
                    updateProductStatus();

                    break;
                case 6://an hien nhieu san pham
                    hideProducts();
                    break;
                case 0:
                    // thoát
                    System.out.println("Thoát menu quản lý sản phẩm");
                    flag = false;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        } while (flag);
    }

    private static void hideProducts() {
        System.out.println("Hãy nhập vào các mã sản phẩm ");
        String idArray = InputMethods.getString();
        String[] ids = idArray.split(",");
        for (int i = 0; i < ids.length; i++) {
            Long id = Long.parseLong(ids[i].trim());
            Product productEdit = productService.findById(id);
            if (productEdit.isStatus()) {
                productEdit.setStatus(false);
            } else productEdit.setStatus(true);

        }
    }

    // chuc nang an hien san pham
    private static void updateProductStatus() {
        // bắt người dùng nhập id cần sửa
        System.out.println("Hãy nhập mã sản phẩm cần sửa");
        Long idEdit = InputMethods.getLong();
        Product productEdit = productService.findById(idEdit);
        if (productEdit == null) {
            System.err.println("Không tìm thấy sản phẩm phù hợp ");
            return;
        }
        // hiển thị giá trị cũ
        System.out.println("--------Thông tin sản phẩm trước khi sửa là ----------");
        System.out.println(productEdit);
        // edit va hiển thi giá trị sau khi edit
        if (productEdit.isStatus()) {
            productEdit.setStatus(false);
        } else productEdit.setStatus(true);
        System.out.println("--------Thông tin sản phẩm sau khi sửa là ----------");
        System.out.println(productEdit);
    }

    //chuc nang ipdate san pham
    private static void updateProduct() {
        System.out.println("Hãy nhập vào Id sản phẩm cần sửa");
        Long productIdEdit = InputMethods.getLong();
        Product productEdit = productService.findById(productIdEdit);
        if (productEdit == null) {
            System.err.println("Không tìm thấy sản phẩm phù hợp ");
            return;
        }
        // hiển thị giá trị cũ
        System.out.println("--------Thông tin sản phẩm cần sửa là ----------");
        System.out.println(productEdit);
        System.out.println("----Hãy nhập giá trị mới-----");
        System.out.println("Hãy nhập vào tên sản phẩm");
        productEdit.setProductName(InputMethods.getString());
        System.out.println("Hãy nhập vào mã danh mục của sản phẩm");
        productEdit.setCategoryId(InputMethods.getLong());
        System.out.println("Hãy nhập vào mô tả sản phẩm");
        productEdit.setDescription(InputMethods.getString());
        System.out.println("Hãy nhập vào giá của sản phẩm");
        productEdit.setUnitPrice(InputMethods.getDouble());
        System.out.println("Nhập vào số lượng sản phẩm còn trong kho");
        productEdit.setStock(InputMethods.getInteger());
        productEdit.setUpdate_at(LocalDateTime.now());
        System.out.println("Hãy nhập vào trạng thái sản phẩm(true,false)");
        productEdit.setStatus(InputMethods.getBoolean());
        productService.update(productEdit);
        System.out.println("Cập nhật thành công");
    }


    // chuc nang them moi san pham
    private static void addProduct() {
        //nhap so san pham muon them
        System.out.println("Những danh mục đang tồn tại");
        for (Catalog cat : catalogService.findAllOrderSortByCreatedDate()
        ) {
            System.out.println(cat.displayNameId());
        }
        Long catalogId;
        while (true) {
            System.out.println("Nhập ID catalog mà bạn muốn thêm sản phẩm");
            catalogId = InputMethods.getLong();
            if (catalogService.findById(catalogId) == null) {
                System.err.println("Hãy nhập lại Id");
            } else
                break;
        }
        int addNum;
        while (true) {
            System.out.println("Hãy nhập số sản phẩm muốn thêm");
            addNum = InputMethods.getInteger();
            if (addNum <= 0) {
                System.out.println("Hãy nhập số lớn hơn 0");
            } else
                break;
        }
        for (int i = 1; i <= addNum; i++) {
            System.out.println("Thêm sản phẩm thứ " + i);
            Long newId = productService.getNewId();
            System.out.println("Mã sản phảm: " + newId);
            //nhap thong tin san pham moi
            String productName;

            productName = getProductName();
//            System.out.println("Hãy nhập vào mã danh mục của sản phẩm");
            System.out.println("Hãy nhập vào mô tả sản phẩm");
            String productdescription = InputMethods.getString();
            System.out.println("Hãy nhập vào giá của sản phẩm");
            double price = InputMethods.getDouble();
            System.out.println("Nhập vào số lượng sản phẩm còn trong kho");
            int stock = InputMethods.getInteger();
            LocalDateTime creatTime = LocalDateTime.now();
            LocalDateTime updateTime = LocalDateTime.now();
            System.out.println("Hãy nhập vào trạng thái sản phẩm(true,false)");
            boolean productstatus = InputMethods.getBoolean();
            Product product = new Product(newId, productName, catalogId, productdescription, price, stock, creatTime, updateTime, productstatus);
            productService.create(product);
            System.out.println("Đã thêm sản phẩm thành công");
        }
    }

    private static String getProductName() {
        String Name;
        while (true) {
            boolean flag = true;
            System.out.println("Hãy nhập vào tên sản phẩm");
            Name = InputMethods.getString();
            for (Product p : productService.findAll()
            ) {
                if (Objects.equals(p.getProductName(), Name)) {
                    flag = false;
                    System.out.println("Tên sản phẩm đã tồn tại");
                    break;
                }
            }
            if (flag) break;
        }
        return Name;
    }

    private static String getCatalogName() {
        String name;
        while (true) {
            boolean flag = true;
            System.out.println("Hãy nhập vào tên danh mục");
            name = InputMethods.getString();
            if (catalogService.existByCatalogName(name)) {
                System.out.println("Tên danh mục đã tồn tại");
            } else break;
        }
        return name;
    }

    // tim ten san pham theo ten
    private static void findProductByName(String name) {
        List<Product> productList = productService.findProductByName(name);
        for (Product p : productList
        ) {
            System.out.println(p);
        }
    }

    public static void displayListProduct(List<Product> list) {
        if (list.isEmpty()) {
            System.err.println("Danh sách sản phảm đang trống");
        } else list.forEach(System.out::println);
    }

}

