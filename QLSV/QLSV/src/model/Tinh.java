package model;

import java.util.Objects;

// phần tỉnh sẽ có 2 thuộc tính đó là mã tỉnh và tên tỉnh
public class Tinh {
	private int maTinh;
	private String tenTinh;

	//tạo ra đối tượng tỉnh
	public Tinh(int maTinh, String tenTinh) {
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}
	
	//geter và seter lấy được dữ liệu hoặc gán dữ liệu vào
	public int getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	// in được thông tin và in được cái chuỗi của tỉnh
	@Override
	public String toString() {
		return "Tinh [maTinh=" + maTinh + ", tenTinh=" + tenTinh + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maTinh, tenTinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tinh other = (Tinh) obj;
		return maTinh == other.maTinh && Objects.equals(tenTinh, other.tenTinh);
	}
	
	
	
	
	
 
}
