package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	//1. �����ڸ� �̿��ؼ� �۾�
	public InsaImpl() {//�⺻������
		
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	//2. setter�޼ҵ带 ȣ���̿��ؼ� �۾��ϴ� ���
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
	}

	@Override
	public MemberDTO getUser(String id) {
		MemberDTO memdto = dao.getUser("id");
		return memdto;
	}

}
