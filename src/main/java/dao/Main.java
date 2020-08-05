package dao;

import java.util.List;

import pojo.Docgia;
import pojo.Sach;

public class Main {

	public static void main(String[] args) {
		List<Sach> list = SachDAO.layDanhSachSach();
		System.out.print(list.get(0).getTheloai().getTentheloai());
	}
}
