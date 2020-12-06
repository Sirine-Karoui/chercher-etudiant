package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantImpl implements IEtudiant{

	@Override
	public List <Etudiant> Chercher_Etudiant(String mot) {
		List <Etudiant> etud= new ArrayList<Etudiant>();
		Connection
		conn=connectionBD.getConnection();
		try {
			PreparedStatement

			ps=conn.prepareStatement(" select * from etudiant where nom like ?");

			String nom = null;
			ps.setString(1,"%"+nom+"%" );
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String prenom = null;
				Etudiant e= new Etudiant(nom, prenom);
				e.setID(rs.getInt("id"));
				e.setNom(rs.getString("nom"));

				e.setPrenom(rs.getString("prenom"));

				etud.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return etud;
	}
	
	}

