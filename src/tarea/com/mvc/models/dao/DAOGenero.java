package tarea.com.mvc.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import tarea.com.mvc.models.Conexion;
import tarea.com.mvc.models.Genero;


public class DAOGenero extends Conexion implements DAO <Genero> {

	@Override
	public ArrayList<Genero> all() {
		ArrayList<Genero> data = new ArrayList<>();

		Connection con= conectar();
		String sql ="select * from generos";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {

				Genero item = new Genero(
						rs.getInt("id_genero"),
						rs.getString("nombre")
						);
				data.add(item);
			}

		} catch(Exception e){
			e.printStackTrace();
		}finally {
			desconectar(con);
		}

		return data;
	}

	@Override
	public Genero find(int id) {
		Genero item =null;

		Connection con= conectar();
		String sql ="select * from generos where id_genero = ?;";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

				item = new Genero(
						rs.getInt("id_genero"),
						rs.getString("nombre")
						);
			}

		} catch(Exception e){
			e.printStackTrace();
		}finally {
			desconectar(con);
		}



		return item;
	}

	@Override
	public boolean store(Genero item) {
		Connection con= conectar();
		String sql ="insert into generos (nombre) values (?);";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, item.getNombre());

			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}

	@Override
	public boolean update(Genero item, int id) {
		Connection con= conectar();
		String sql ="update generos set nombre = ? where id_genero = ?;";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, item.getNombre());
			ps.setInt(2, item.getId());
			
			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}


	@Override
	public boolean destroy(int id) {
		Connection con= conectar();
		String sql ="delete from generos where id_genero = ?";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,id);

			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}
	
	
}


