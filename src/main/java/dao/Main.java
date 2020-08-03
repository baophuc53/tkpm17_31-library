package dao;

import java.util.List;

import pojo.Docgia;

public class Main {

	public static void main(String[] args) {
		List<Docgia> list = DocgiaDAO.layDanhSachDocgia();
		System.out.print(list.get(0).getHoten());
	}

}
