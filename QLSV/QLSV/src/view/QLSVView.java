package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	QLSVModel model;
	private JTextField textField_maSinhVien;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_hovaten;
	private JTextField textField_ngaySinh;
	private JTextField textField_Diemmon3;
	private JTextField textField_Diemmon2;
	private JTextField textField_mon1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 697);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File\r\n");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutme = new JMenuItem("About Me");
		menuAboutme.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuAbout.add(menuAboutme);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Quê Quán");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_QueQuan.setBounds(10, 11, 120, 36);
		contentPane.add(label_QueQuan);
		
		JLabel label_maThiSinh = new JLabel("Mã Thí Sinh");
		label_maThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_maThiSinh.setBounds(439, 11, 152, 36);
		contentPane.add(label_maThiSinh);
		
		textField_maSinhVien = new JTextField();
		textField_maSinhVien.setColumns(10);
		textField_maSinhVien.setBounds(594, 5, 229, 60);
		contentPane.add(textField_maSinhVien);
		
		JComboBox comboBox_queQuan = new JComboBox();
		comboBox_queQuan.setBounds(140, 5, 243, 60);
		contentPane.add(comboBox_queQuan);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTimKiem.setBounds(855, 17, 146, 36);
		contentPane.add(btnTimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 76, 991, 2);
		contentPane.add(separator_1);
		
		JLabel label_danhSachThiSinh = new JLabel("Danh Sách Thí Sinh");
		label_danhSachThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_danhSachThiSinh.setBounds(10, 89, 229, 36);
		contentPane.add(label_danhSachThiSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				 "Mã Thí Sinh", "Họ và Tên", "Quê Quán", "Ngày Sinh", "Giới Tính", "Điểm Môn 1", "Điểm môn 2","Điểm môn 3"
			}
		));
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 122, 991, 125);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 258, 991, 2);
		contentPane.add(separator_1_1);
		
		JLabel label_thongTinhThiSinh = new JLabel("Thông Tin Thí Sinh\r\n");
		label_thongTinhThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_thongTinhThiSinh.setBounds(10, 271, 229, 36);
		contentPane.add(label_thongTinhThiSinh);
		
		JLabel label_ID = new JLabel("Mã Thí Sinh");
		label_ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_ID.setBounds(10, 319, 125, 27);
		contentPane.add(label_ID);
		
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_ID.setColumns(10);
		textField_ID.setBounds(140, 318, 175, 36);
		contentPane.add(textField_ID);
		
		JLabel label_hovaten = new JLabel("Họ Và Tên\r\n");
		label_hovaten.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_hovaten.setBounds(10, 366, 125, 27);
		contentPane.add(label_hovaten);
		
		textField_hovaten = new JTextField();
		textField_hovaten.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_hovaten.setColumns(10);
		textField_hovaten.setBounds(140, 365, 175, 36);
		contentPane.add(textField_hovaten);
		
		JLabel lable_queQuanT = new JLabel("Quê Quán");
		lable_queQuanT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_queQuanT.setBounds(10, 413, 125, 27);
		contentPane.add(lable_queQuanT);
		
		JLabel lable_ngaySinh = new JLabel("Ngày Sinh");
		lable_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_ngaySinh.setBounds(10, 460, 125, 27);
		contentPane.add(lable_ngaySinh);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(140, 459, 175, 36);
		contentPane.add(textField_ngaySinh);
		
		JComboBox comboBox_queQuanT = new JComboBox();
		comboBox_queQuanT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_queQuanT.setBounds(140, 412, 175, 36);
		contentPane.add(comboBox_queQuanT);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 506, 991, 2);
		contentPane.add(separator_1_1_1);
		
		JLabel lable_Diemmon3 = new JLabel("Điểm môn 3\r\n");
		lable_Diemmon3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_Diemmon3.setBounds(558, 460, 125, 27);
		contentPane.add(lable_Diemmon3);
		
		textField_Diemmon3 = new JTextField();
		textField_Diemmon3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Diemmon3.setColumns(10);
		textField_Diemmon3.setBounds(688, 459, 175, 36);
		contentPane.add(textField_Diemmon3);
		
		JLabel lable_Diemmon2 = new JLabel("Điểm môn 2\r\n");
		lable_Diemmon2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_Diemmon2.setBounds(558, 414, 125, 27);
		contentPane.add(lable_Diemmon2);
		
		textField_Diemmon2 = new JTextField();
		textField_Diemmon2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Diemmon2.setColumns(10);
		textField_Diemmon2.setBounds(688, 413, 175, 36);
		contentPane.add(textField_Diemmon2);
		
		JLabel lable_Diemmon1 = new JLabel("Điểm môn 1\r\n");
		lable_Diemmon1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_Diemmon1.setBounds(558, 368, 125, 27);
		contentPane.add(lable_Diemmon1);
		
		textField_mon1 = new JTextField();
		textField_mon1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_mon1.setColumns(10);
		textField_mon1.setBounds(688, 366, 175, 36);
		contentPane.add(textField_mon1);
		
		JLabel lable_gioiTinh = new JLabel("Giới Tính\r\n");
		lable_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lable_gioiTinh.setBounds(558, 329, 125, 27);
		contentPane.add(lable_gioiTinh);
		
		JRadioButton rdbtn_Nam = new JRadioButton("Nam");
		rdbtn_Nam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtn_Nam.setBounds(688, 331, 63, 23);
		contentPane.add(rdbtn_Nam);
		
		JRadioButton rdbtn_Nữ = new JRadioButton("Nữ\r\n");
		rdbtn_Nữ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtn_Nữ.setBounds(800, 331, 63, 23);
		contentPane.add(rdbtn_Nữ);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Them.setBounds(10, 534, 146, 44);
		contentPane.add(btn_Them);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_xoa.setBounds(205, 534, 146, 44);
		contentPane.add(btn_xoa);
		
		JButton btn_capNhat = new JButton("Cập Nhật ");
		btn_capNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_capNhat.setBounds(424, 534, 146, 44);
		contentPane.add(btn_capNhat);
		
		JButton btn_huyBo = new JButton("Hủy Bỏ");
		btn_huyBo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_huyBo.setBounds(855, 534, 146, 44);
		contentPane.add(btn_huyBo);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_luu.setBounds(650, 534, 146, 44);
		contentPane.add(btn_luu);
		
		
		this.setVisible(true);
	}
}
