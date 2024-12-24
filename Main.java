import java.sql.Date;
import java.text.SimpleDateFormat;
import static java.lang.System.out;
import static java.lang.System.console;

void main()
{
out.print("\n NHẬP XUẤT DỮ LIỆU NHÂN SỰ");

// -  Họ Và Tên (chuỗi)
// -  Năm Gia Nhập (số nguyên)
// - Chiều Cao (số thực)
// - Nhóm Máu (kí tự)
// - Đã Nghỉ Hưu (hay chưa)
// - Ngày Sinh (ngày tháng)
String Tên;
Integer Năm;
Float Cao;
Character Nhóm;
Boolean Đnh;
Date Ngày;

// out.print("\n Đã xong việc khai báo biến!");

// Tên = "Nguyễn Xuân Tùng";
// Năm = 2020;
// Cao = 1.73f;
// Nhóm = 'B';
// Đnh = true;
// Ngày = Date.valueOf("2024-12-24");

// out.print("\n Đã xong việc gán hằng giá trị cho biến !");

// out.print("\n+-------------------------------------------------------------------------------------+");
// out.print("\n| HỌ VÀ TÊN NHÂN VIÊN | NĂM GIA NHẬP | CHIỀU CAO | NHÓM MÁU | ĐÃ NGHỈ HƯU | NGÀY SINH |");
// out.print("\n+-------------------------------------------------------------------------------------+");
// out.printf("\n| %19s | %12d | %9.2f | %8c | %11s | %9s |",
//  Tên, Năm, Cao, Nhóm, Đnh ? "Rồi" : "Chưa", new SimpleDateFormat(pattern:"dd/MM/yyyy").format(Ngày));
// out.print("\n+-------------------------------------------------------------------------------------+");

// out.print("\n Đã xong việc xuất dữ liệu tĩnh ra bảng Terminal !");

out.print("\n Nhập tên: ");
Tên = console().readLine();

out.print("\n Nhập năm vào: ");
Năm = Integer.parseInt(console().readLine());

out.print("\n Nhập chiều cao: ");
Cao = Float.parseFloat(console().readLine());

out.print("\n Nhập nhóm máu (A, B, O): ");
Nhóm = console().readLine().charAt(0);

out.print("\n Đã nghỉ hưu hay chưa (true/false): ");
Đnh = Boolean.valueOf(console().readLine());

out.print("\n Nhập năm sinh (yyyy-MM-dd): ");
Ngày = Date.valueOf(console().readLine());

out.print("\n+-------------------------------------------------------------------------------------+");
out.print("\n| HỌ VÀ TÊN NHÂN VIÊN | NĂM GIA NHẬP | CHIỀU CAO | NHÓM MÁU | ĐÃ NGHỈ HƯU | NGÀY SINH |");
out.print("\n+-------------------------------------------------------------------------------------+");
out.printf("\n| %19s | %12d | %9.2f | %8c | %11s | %9s |",
 Tên, Năm, Cao, Nhóm, Đnh ? "Rồi" : "Chưa", new SimpleDateFormat("dd/MM/yyyy").format(Ngày));
out.print("\n+-------------------------------------------------------------------------------------+");

out.print("\n Đã xong việc xuất dữ liệu tĩnh ra bảng Terminal !");
}

// java --enable-preview Main.java
// NHẬP XUẤT DỮ LIỆU NHÂN SỰ
// Nhập tên: Nguyễn Xuân Tùng

// Nhập năm vào: 2020

// Nhập chiều cao: 1.73

// Nhập nhóm máu (A, B, O): B

// Đã nghỉ hưu hay chưa (true/false): false

// Nhập năm sinh (yyyy-MM-dd): 1993-04-02

// +-------------------------------------------------------------------------------------+
// | HỌ VÀ TÊN NHÂN VIÊN | NĂM GIA NHẬP | CHIỀU CAO | NHÓM MÁU | ĐÃ NGHỈ HƯU | NGÀY SINH |
// +-------------------------------------------------------------------------------------+
// |    Nguyễn Xuân Tùng |         2020 |      1.73 |        B |        Chưa | 02/04/1993 |
// +-------------------------------------------------------------------------------------+
// Đã xong việc xuất dữ liệu tĩnh ra bảng Terminal !