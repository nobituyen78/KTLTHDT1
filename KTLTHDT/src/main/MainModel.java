package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.DongCo;
import model.HoaDon;
import model.LapTop;
import model.LopHoc;
import model.SanPham;
import model.SinhVien;
import model.XeHoi;


public class MainModel {


	    public static void main(String[] args) throws CloneNotSupportedException, SQLException {

	        // Khởi tạo dữ liệu mẫu cho xe hơi, laptop và sinh viên
	        List<XeHoi> cars = new ArrayList<>();
	        cars.add(new XeHoi(1, "H2R", 100, 1250000, new DongCo("Dong co xang", 1000)));
	        cars.add(new XeHoi(2, "DUCATI", 1000, 3890000, new DongCo("Dong co xang", 1000)));
	        cars.add(new XeHoi(3, "YUSASI", 100, 6500000, new DongCo("Dong co xang", 1000)));
	        cars.add(new XeHoi(4, "ZX10R", 100, 6180000, new DongCo("Dong co xang", 1000)));
	        cars.add(new XeHoi(5, "S1000R", 100, 1013950, new DongCo("Dong co dien", 1000)));
	        cars.add(new XeHoi(6, "CBR1000RR", 100, 2620000, new DongCo("Dong co dien", 1000)));
	        cars.add(new XeHoi(7, "R1", 100, 8500000, new DongCo("Dong co dien", 1000)));

	        List<LapTop> lt = new ArrayList<>();
	        lt.add(new LapTop(1, "HP PAVILION 15", 123, 15000, 4, "16GB DDR4"));
	        lt.add(new LapTop(2, "MACBOOK", 1234, 14670, 8, "8GB DDR4"));
	        lt.add(new LapTop(3, "ASUS TUF GAMING", 231, 13290, 4, "16GB DDR4"));
	        lt.add(new LapTop(4, "ACER ASPIRE 7", 101, 8200, 4, "8GB DDR3"));
	        lt.add(new LapTop(5, "LG ", 120, 12490, 4, "8GB DDR4"));
	        lt.add(new LapTop(6, "MIS MODERM 15 ", 1500, 13490, 4, "16GB DDR4"));
	        lt.add(new LapTop(7, "LENOVOLOQ", 100, 26490, 4, "8GB DDR4"));

	        List<SinhVien> dssv = new ArrayList<>();
	        dssv.add(new SinhVien("Hồ Minh Tuyên", "9876543210", new LopHoc("CNTT")));
	        dssv.add(new SinhVien("Đinh Đức Việt", "0123456789", new LopHoc("CNTT")));
	        dssv.add(new SinhVien("Hồ Thị Lê Na", "0123654789", new LopHoc("QTKD")));
	        dssv.add(new SinhVien("Trần Công Quý ", "0987456321", new LopHoc("KHTN")));
	        dssv.add(new SinhVien("Hoàng Văn Thuận ", "0123458769", new LopHoc("KTMT")));
	        List<SanPham> sanPhams1 = new ArrayList<>();
	        sanPhams1.add(new XeHoi(1, "Toyota", 100, 1250000, new DongCo("Dong co xang", 147)));
	        
	        List<SanPham> sanPhams2 = new ArrayList<>();
	        sanPhams2.add(new LapTop(1, "Dell", 123, 15000, 4, "16GB DDR4"));
	        
	   

	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            showMenu();
	            choice = sc.nextInt();
	            sc.nextLine(); // Consume newline left-over
	            switch (choice) {
	                case 1:
	                    hienthidanhsachbanhxe(cars);
	                    break;
	                case 2:
	                    hienthidanhsachlaptop(lt);
	                    break;
	                case 3:
	                    xapseplaptoptheogia(lt);
	                    break;
	                case 4:
	                    timkiem(lt, sc);
	                    break;
	                case 5:
	                    xoa(lt, sc);
	                    break;
	                case 6:
	                    timkiemXe(cars, sc);
	                    break;
	                case 7:
	                    xapsepxetheogia(cars);
	                    break;
	                case 8:
	                    xoaXe(cars, sc);
	                    break;
	                case 9:
	                    ketnoiMayChuCSDL();
	                    break;
	                case 10:
	                    hienthidanhsachsinhvien(dssv);
	                    break;
	                case 11:
	                    xoasinhvien(dssv, sc);
	                    break;
	                case 12:
	                    System.out.print("\nNhập tên sinh viên để tạo hóa đơn: ");
	                    String tenSinhVien = sc.nextLine().trim();
	                    SinhVien sv = dssv.stream()
	                            .filter(s -> s.getHoten().equalsIgnoreCase(tenSinhVien))
	                            .findFirst()
	                            .orElse(null);
	                    if (sv != null) {
	                        List<SanPham> sanPhams = new ArrayList<>();
	                        sanPhams.add(new XeHoi(1, "Toyota", 100, 1250000, new DongCo("Dong co xang", 147)));
	                        sanPhams.add(new LapTop(1, "Dell", 123, 15000, 4, "16GB DDR4"));
	                        taoHoaDon(sv, sanPhams);
	                    } else {
	                        System.out.println("Sinh viên không tồn tại.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Bạn Đã Thoát chương trình.");
	                    System.out.println("Chúc Bạn Có 1 Ngày Tốt Đẹp.");
	                    System.out.println("Hẹn Gặp Lại Bạn Trong Một Ngày Đẹp Trời .");
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
	                    break;
	            }
	        } while (choice != 0);
	        sc.close();
	    }

    public static void showMenu() {
        System.out.println("\n********************************************");
        System.out.println("* |               MENU                      | *");
        System.out.println("********************************************");
        System.out.println("* |     Quản Lý Tài Sản Của Cửa Hàng NOBI   | *");
        System.out.println("********************************************");
        System.out.println("* | 1. Hiển thị danh sách xe hơi            | *");
        System.out.println("* | 2. Hiển thị danh sách laptop            | *");
        System.out.println("* | 3. Xắp xếp laptop theo giá              | *");
        System.out.println("* | 4. Tìm kiếm laptop                      | *");
        System.out.println("* | 5. Xóa                                  | *");
        System.out.println("* | 6. Tìm kiếm xe                          | *");
        System.out.println("* | 7. Xắp xếp xe theo giá                  | *");
        System.out.println("* | 8. Xóa xe                               | *");
        System.out.println("* | 9. Kết nối máy chủ CSDL                 | *");
        System.out.println("* | 10. Hiển thị danh sách sinh viên        | *");
        System.out.println("* | 11. Xóa sinh viên                       | *");
        System.out.println("* | 12. Tạo hóa đơn                         | *"); 
        System.out.println("* | 0. Thoát                                | *");
        System.out.println("********************************************");
        System.out.print("Vui lòng chọn (0-12): ");
    }
    
    public static void taoHoaDon(SinhVien sinhVien, List<SanPham> sanPhams) {
        // Tạo sao chép danh sách sản phẩm nếu cần
        List<SanPham> saoChepSanPhams = new ArrayList<>();
        for (SanPham sp : sanPhams) {
            try {
                saoChepSanPhams.add((SanPham) sp.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        int soHD = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        HoaDon hoaDon = new HoaDon(soHD);

        // Hiển thị hóa đơn
        System.out.println("\nHóa đơn của sinh viên " + sinhVien.getHoten() + ":");
        System.out.println("Đả Mua Các Sản Phẩm");
        System.out.println("Số hóa đơn: " + hoaDon.getSoHD());
        System.out.println("|----------------------------------------------------------|");
        System.out.printf("| %-3s | %-15s | %-8s | %-10s |\n", "ID", "Tên", "Số Lượng", "Giá Cả");
        System.out.println("|----------------------------------------------------------|");   


        for (SanPham sp : hoaDon.getDssp()) {
            System.out.printf("| %-3d | %-15s | %-8d | %-10.2f |\n", sp.getMaSP(), sp.getTenSP(), sp.getSoluong(), sp.getGiaca());
        }

        System.out.println("|----------------------------------------------------------|");
    }

    public static void hienthidanhsachbanhxe(List<XeHoi> cars) {
        System.out.println("\nDanh sách bánh xe của các xe hơi:");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| %-3s | %-15s | %-8s | %-12s | %-30s | %-100s |\n", "ID", "Tên", "Số Lượng", "Giá Cả", "Động Cơ", "Bánh Xe");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        for (XeHoi car : cars) {
            System.out.printf("| %-3d | %-15s | %-8d | %-12.3f | %-30s | %-100s |\n",
                    car.getMaSP(), car.getTenSP(), car.getSoluong(), car.getGiaca(), car.getDongco(), car.getDsbx());
        }
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
    }

    public static void hienthidanhsachlaptop(List<LapTop> lt) {
        System.out.println("\nDanh sách laptop:");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.printf("| %-3s | %-15s | %-8s | %-10s | %-5s | %-15s |\n", "ID", "Tên", "Số Lượng", "Giá Cả", "RAM", "CPU");
        System.out.println("|-------------------------------------------------------------------------|");
        for (LapTop item : lt) {
            System.out.printf("| %-3d | %-15s | %-8d | %-10.3f | %-5d | %-15s |\n",
                    item.getMaSP(), item.getTenSP(), item.getSoluong(), item.getGiaca(), item.getRam(), item.getCpu());
        }
        System.out.println("|-------------------------------------------------------------------------|");
    }

    public static void xapseplaptoptheogia(List<LapTop> lt) {
        // Sắp xếp danh sách laptop theo giá cả tăng dần
        lt.sort(Comparator.comparingDouble(LapTop::getGiaca));

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách laptop được sắp xếp theo giá cả:");
        System.out.println("|-------------------------------------------------------------------------|");
        System.out.printf("| %-3s | %-15s | %-8s | %-10s | %-5s | %-15s |\n", "ID", "Tên", "Số Lượng", "Giá Cả", "RAM", "CPU");
        System.out.println("|-------------------------------------------------------------------------|");
        for (LapTop item : lt) {
            System.out.printf("| %-3d | %-15s | %-8d | %-10.3f | %-5d | %-15s |\n",
                    item.getMaSP(), item.getTenSP(), item.getSoluong(), item.getGiaca(), item.getRam(), item.getCpu());
        }
        System.out.println("|-------------------------------------------------------------------------|");
    }

    public static void timkiem(List<LapTop> lt, Scanner sc) {
        System.out.print("\nNhập tên laptop cần tìm: ");
        String name = sc.nextLine().trim();

        // Sắp xếp danh sách laptop theo tên
        Collections.sort(lt, Comparator.comparing(LapTop::getTenSP));

        // Tìm kiếm bằng binarySearch
        int vitri = Collections.binarySearch(lt, new LapTop(0, name, 0, 0, 0, null), Comparator.comparing(LapTop::getTenSP));

        // Kiểm tra kết quả tìm kiếm
        if (vitri >= 0) {
            // Nếu tìm thấy
            System.out.println("Laptop '" + name + "' đã được tìm thấy.");
            System.out.println("|-------------------------------------------------------------------------|");
            System.out.printf("| %-3s | %-15s | %-8s | %-10s | %-5s | %-15s |\n", "ID", "Tên", "Số Lượng", "Giá Cả", "RAM", "CPU");
            System.out.println("|-------------------------------------------------------------------------|");
            LapTop foundLaptop = lt.get(vitri); // Lấy đối tượng laptop từ vị trí tìm được
            System.out.printf("| %-3d | %-15s | %-8d | %-10.3f | %-5d | %-15s |\n",
                    foundLaptop.getMaSP(), foundLaptop.getTenSP(), foundLaptop.getSoluong(),
                    foundLaptop.getGiaca(), foundLaptop.getRam(), foundLaptop.getCpu());
            System.out.println("|-------------------------------------------------------------------------|");
        } else {
            // Nếu không tìm thấy
            System.out.println("Không tìm thấy laptop '" + name + "'.");
        }
    }
    public static void xoa(List<LapTop> lt, Scanner sc) {
        System.out.print("\nNhập tên laptop cần xóa: ");
        String name = sc.nextLine().trim();

        Iterator<LapTop> iterator = lt.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            LapTop laptop = iterator.next();
            if (laptop.getTenSP().trim().equalsIgnoreCase(name)) {
                iterator.remove();
                found = true;
                System.out.println("Laptop '" + name + "' đã được xóa.");
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy laptop '" + name + "'.");
        } else {
            System.out.println("\nDanh sách laptop sau khi xóa:");
            hienthidanhsachlaptop(lt);
        }
    }
    public static void timkiemXe(List<XeHoi> cars, Scanner sc) {
        System.out.print("\nNhập tên xe hơi cần tìm: ");
        String name = sc.nextLine().trim();

        // Sắp xếp danh sách theo tên nếu chưa được sắp xếp
        cars.sort(Comparator.comparing(XeHoi::getTenSP));

        // Thực hiện tìm kiếm nhị phân
        int vitri = Collections.binarySearch(cars, new XeHoi(0, name, 0, 0, null), Comparator.comparing(XeHoi::getTenSP));

        // Kiểm tra kết quả tìm kiếm
        if (vitri >= 0) {
            // Tìm thấy mục
            hienthidanhsachbanhxe(Collections.singletonList(cars.get(vitri))); // Hiển thị thông tin xe hơi được tìm thấy
        } else {
            // Không tìm thấy mục
            int insertPoint = -(vitri + 1); // Tính toán vị trí chèn nếu cần
            System.out.println("Không tìm thấy xe hơi '" + name + "'.");
            if (insertPoint < cars.size()) {
                System.out.println("Xe hơi '" + name + "' có thể được chèn vào vị trí " + (insertPoint + 1)); // +1 để hiển thị vị trí chèn theo đánh số từ 1
            } else {
                System.out.println("Xe hơi '" + name + "' sẽ được chèn vào cuối danh sách.");
            }
        }
    }
    public static void xapsepxetheogia(List<XeHoi> cars) {
        // Sắp xếp danh sách xe hơi theo giá cả tăng dần
        cars.sort(Comparator.comparingDouble(XeHoi::getGiaca));

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách xe hơi được sắp xếp theo giá cả:");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| %-3s | %-15s | %-8s | %-12s | %-30s | %-100s |\n", "ID", "Tên", "Số Lượng", "Giá Cả", "Động Cơ", "Bánh Xe");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        for (XeHoi car : cars) {
            System.out.printf("| %-3d | %-15s | %-8d | %-12.3f | %-30s | %-100s |\n",
                    car.getMaSP(), car.getTenSP(), car.getSoluong(), car.getGiaca(), car.getDongco(), car.getDsbx());
        }
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|");
    }
    public static void xoaXe(List<XeHoi> cars, Scanner sc) {
        System.out.print("\nNhập tên xe hơi cần xóa: ");
        String name = sc.nextLine().trim();

        Iterator<XeHoi> iterator = cars.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            XeHoi car = iterator.next();
            if (car.getTenSP().trim().equalsIgnoreCase(name)) {
                iterator.remove();
                found = true;
                System.out.println("Xe hơi '" + name + "' đã được xóa.");
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe hơi '" + name + "'.");
        } else {
            System.out.println("\nDanh sách xe hơi sau khi xóa:");
            hienthidanhsachbanhxe(cars);
        }
    }
    
    public static void ketnoiMayChuCSDL() throws SQLException {
    	
			Object ktlthdt;
			Connection kncsdl = model.DBConnection.getInstance().getConnection();
			if(kncsdl != null) {
				System.out.println( "Ket Noi Toi May Chu CSDL, Thanh Cong.");
			} else {
				System.out.println("Loi Ket Noi");
			}
		
    }
    public static void hienthidanhsachsinhvien(List<SinhVien> dssv) {
        System.out.println("\nDanh sách sinh viên:");
        System.out.println("|---------------------------------------------------|");
        System.out.printf("| %-20s | %-12s | %-10s |\n", "Tên", "Số Điện Thoại",  "Lớp Học");
        System.out.println("|---------------------------------------------------|");
        for (SinhVien sv : dssv) {
            System.out.printf("| %-20s | %-12s | %-10s  |\n", sv.getHoten(), sv.getSdt(), sv.getLop().getTenLop());
        }
        System.out.println("|---------------------------------------------------|");
    }
    public static void xoasinhvien(List<SinhVien> dssv, Scanner sc) {
        System.out.print("\nNhập tên sinh viên cần xóa: ");
        String name = sc.nextLine().trim();

        Iterator<SinhVien> iterator = dssv.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            SinhVien sv = iterator.next();
            if (sv.getHoten().trim().equalsIgnoreCase(name)) {
                iterator.remove();
                found = true;
                System.out.println("Sinh viên '" + name + "' đã được xóa.");
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên '" + name + "'.");
        } else {
            System.out.println("\nDanh sách sinh viên sau khi xóa:");
            hienthidanhsachsinhvien(dssv);
        }
    }
   

}