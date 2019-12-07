package br.com.projeto.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.projeto.agenda.models.Contact;

public class FormHelper {

    private final EditText name;
    private final EditText address;
    private final EditText site;
    private final EditText tel;
    private final RatingBar rate;

    public FormHelper(FormActivity activity)
    {
        name = (EditText) activity.findViewById(R.id.form_name);
//        String name = txtName.

        address = (EditText) activity.findViewById(R.id.form_address);
//        String address = txtAddress.getText().toString();

        site = (EditText) activity.findViewById(R.id.form_site);
//        String site = txtSite.getText().toString();

        tel= (EditText) activity.findViewById(R.id.form_tel);
//        String tel = txtTel.getText().toString();

        rate = (RatingBar) activity.findViewById(R.id.form_rate);
    }

    public Contact getContact()
    {
        Contact contact = new Contact();

        contact.setName(name.getText().toString());
        contact.setAddress(address.getText().toString());
        contact.setSite(site.getText().toString());
        contact.setTel(tel.getText().toString());
        contact.setRate(Double.valueOf(rate.getProgress()));

        return contact;
    }

}
