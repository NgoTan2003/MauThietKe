package BaiTap;

import com.peter.dp.SinhVien;

public class PhanTuCuaSinhVien implements PhanTu {
	private SinhVien sv;

	public PhanTuCuaSinhVien(SinhVien sv) {
		this.sv = sv;
	}

	@Override
	public String getDanhGia() {
		double dtb = sv.getDiemTrungBinh();
		if (dtb > 8.5)
			return "A";
		else if (dtb > 7.5)
			return "B";
		else if (dtb > 6.5)
			return "C";
		else if (dtb >= 4)
			return "D";
		else
			return "X";
	}

	@Override
	public String getLoaiPhanTu() {
		return "SV";
	}

	@Override
	public String getTen() {
//		return sv.getHoTen();
		return String.format("%s (%.1f)", sv.getHoTen(), sv.getDiemTrungBinh());
	}

}
