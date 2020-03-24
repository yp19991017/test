import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
/*
 * �����û������Ĳ�����
 */
class TestUser {

	@Test
	void test() {
		
		try {
			//1����ȡmybatis���������ļ���һ������������
			InputStream is =  Resources.getResourceAsStream("mybatis-config.xml");
			//2��ͨ��������������SQL session factory����
			SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
			//3��ͨ��SQL session factory����������SQL session����
			SqlSession sqlsession = fac.openSession();
			//4������SQL session����ķ�����ִ�в���
			//ִ��sql���ֻ����һ�����ݵķ��� selectOne
			int count = sqlsession.selectOne("dao.UserMapper.getCount");
			System.out.println("��õ�����������"+count);
			//5���ر�SQL session����
			sqlsession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
