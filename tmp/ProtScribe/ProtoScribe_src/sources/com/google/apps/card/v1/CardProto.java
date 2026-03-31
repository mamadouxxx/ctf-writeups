package com.google.apps.card.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.type.ColorProto;

/* JADX INFO: loaded from: classes2.dex */
public final class CardProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001egoogle/apps/card/v1/card.proto\u0012\u0013google.apps.card.v1\u001a\u0017google/type/color.proto\"Ç\b\n\u0004Card\u00124\n\u0006header\u0018\u0001 \u0001(\u000b2$.google.apps.card.v1.Card.CardHeader\u00123\n\bsections\u0018\u0002 \u0003(\u000b2!.google.apps.card.v1.Card.Section\u0012E\n\u0015section_divider_style\u0018\t \u0001(\u000e2&.google.apps.card.v1.Card.DividerStyle\u0012:\n\fcard_actions\u0018\u0003 \u0003(\u000b2$.google.apps.card.v1.Card.CardAction\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\u0012?\n\ffixed_footer\u0018\u0005 \u0001(\u000b2).google.apps.card.v1.Card.CardFixedFooter\u0012=\n\rdisplay_style\u0018\u0006 \u0001(\u000e2&.google.apps.card.v1.Card.DisplayStyle\u0012>\n\u0010peek_card_header\u0018\u0007 \u0001(\u000b2$.google.apps.card.v1.Card.CardHeader\u001a\u0093\u0001\n\nCardHeader\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u0010\n\bsubtitle\u0018\u0002 \u0001(\t\u00129\n\nimage_type\u0018\u0003 \u0001(\u000e2%.google.apps.card.v1.Widget.ImageType\u0012\u0011\n\timage_url\u0018\u0004 \u0001(\t\u0012\u0016\n\u000eimage_alt_text\u0018\u0005 \u0001(\t\u001a\u0081\u0001\n\u0007Section\u0012\u000e\n\u0006header\u0018\u0001 \u0001(\t\u0012,\n\u0007widgets\u0018\u0002 \u0003(\u000b2\u001b.google.apps.card.v1.Widget\u0012\u0013\n\u000bcollapsible\u0018\u0005 \u0001(\b\u0012#\n\u001buncollapsible_widgets_count\u0018\u0006 \u0001(\u0005\u001aR\n\nCardAction\u0012\u0014\n\faction_label\u0018\u0001 \u0001(\t\u0012.\n\bon_click\u0018\u0002 \u0001(\u000b2\u001c.google.apps.card.v1.OnClick\u001a}\n\u000fCardFixedFooter\u00123\n\u000eprimary_button\u0018\u0001 \u0001(\u000b2\u001b.google.apps.card.v1.Button\u00125\n\u0010secondary_button\u0018\u0002 \u0001(\u000b2\u001b.google.apps.card.v1.Button\"P\n\fDividerStyle\u0012\u001d\n\u0019DIVIDER_STYLE_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rSOLID_DIVIDER\u0010\u0001\u0012\u000e\n\nNO_DIVIDER\u0010\u0002\"D\n\fDisplayStyle\u0012\u001d\n\u0019DISPLAY_STYLE_UNSPECIFIED\u0010\u0000\u0012\b\n\u0004PEEK\u0010\u0001\u0012\u000b\n\u0007REPLACE\u0010\u0002\"\u0086\u0006\n\u0006Widget\u0012<\n\u000etext_paragraph\u0018\u0001 \u0001(\u000b2\".google.apps.card.v1.TextParagraphH\u0000\u0012+\n\u0005image\u0018\u0002 \u0001(\u000b2\u001a.google.apps.card.v1.ImageH\u0000\u0012<\n\u000edecorated_text\u0018\u0003 \u0001(\u000b2\".google.apps.card.v1.DecoratedTextH\u0000\u00126\n\u000bbutton_list\u0018\u0004 \u0001(\u000b2\u001f.google.apps.card.v1.ButtonListH\u0000\u00124\n\ntext_input\u0018\u0005 \u0001(\u000b2\u001e.google.apps.card.v1.TextInputH\u0000\u0012>\n\u000fselection_input\u0018\u0006 \u0001(\u000b2#.google.apps.card.v1.SelectionInputH\u0000\u0012?\n\u0010date_time_picker\u0018\u0007 \u0001(\u000b2#.google.apps.card.v1.DateTimePickerH\u0000\u0012/\n\u0007divider\u0018\t \u0001(\u000b2\u001c.google.apps.card.v1.DividerH\u0000\u0012)\n\u0004grid\u0018\n \u0001(\u000b2\u0019.google.apps.card.v1.GridH\u0000\u0012/\n\u0007columns\u0018\u000b \u0001(\u000b2\u001c.google.apps.card.v1.ColumnsH\u0000\u0012M\n\u0014horizontal_alignment\u0018\b \u0001(\u000e2/.google.apps.card.v1.Widget.HorizontalAlignment\"#\n\tImageType\u0012\n\n\u0006SQUARE\u0010\u0000\u0012\n\n\u0006CIRCLE\u0010\u0001\"[\n\u0013HorizontalAlignment\u0012$\n HORIZONTAL_ALIGNMENT_UNSPECIFIED\u0010\u0000\u0012\t\n\u0005START\u0010\u0001\u0012\n\n\u0006CENTER\u0010\u0002\u0012\u0007\n\u0003END\u0010\u0003B\u0006\n\u0004data\"\u001d\n\rTextParagraph\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\"\\\n\u0005Image\u0012\u0011\n\timage_url\u0018\u0001 \u0001(\t\u0012.\n\bon_click\u0018\u0002 \u0001(\u000b2\u001c.google.apps.card.v1.OnClick\u0012\u0010\n\balt_text\u0018\u0003 \u0001(\t\"\t\n\u0007Divider\"\u009e\u0005\n\rDecoratedText\u0012+\n\u0004icon\u0018\u0001 \u0001(\u000b2\u0019.google.apps.card.v1.IconB\u0002\u0018\u0001\u0012-\n\nstart_icon\u0018\f \u0001(\u000b2\u0019.google.apps.card.v1.Icon\u0012\u0011\n\ttop_label\u0018\u0003 \u0001(\t\u0012\f\n\u0004text\u0018\u0004 \u0001(\t\u0012\u0011\n\twrap_text\u0018\u0005 \u0001(\b\u0012\u0014\n\fbottom_label\u0018\u0006 \u0001(\t\u0012.\n\bon_click\u0018\u0007 \u0001(\u000b2\u001c.google.apps.card.v1.OnClick\u0012-\n\u0006button\u0018\b \u0001(\u000b2\u001b.google.apps.card.v1.ButtonH\u0000\u0012J\n\u000eswitch_control\u0018\t \u0001(\u000b20.google.apps.card.v1.DecoratedText.SwitchControlH\u0000\u0012-\n\bend_icon\u0018\u000b \u0001(\u000b2\u0019.google.apps.card.v1.IconH\u0000\u001a\u0081\u0002\n\rSwitchControl\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u0012\u0010\n\bselected\u0018\u0003 \u0001(\b\u00125\n\u0010on_change_action\u0018\u0004 \u0001(\u000b2\u001b.google.apps.card.v1.Action\u0012R\n\fcontrol_type\u0018\u0005 \u0001(\u000e2<.google.apps.card.v1.DecoratedText.SwitchControl.ControlType\"6\n\u000bControlType\u0012\n\n\u0006SWITCH\u0010\u0000\u0012\f\n\bCHECKBOX\u0010\u0001\u0012\r\n\tCHECK_BOX\u0010\u0002B\t\n\u0007control\"ô\u0002\n\tTextInput\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005label\u0018\u0002 \u0001(\t\u0012\u0011\n\thint_text\u0018\u0003 \u0001(\t\u0012\r\n\u0005value\u0018\u0004 \u0001(\t\u00121\n\u0004type\u0018\u0005 \u0001(\u000e2#.google.apps.card.v1.TextInput.Type\u00125\n\u0010on_change_action\u0018\u0006 \u0001(\u000b2\u001b.google.apps.card.v1.Action\u0012=\n\u0013initial_suggestions\u0018\u0007 \u0001(\u000b2 .google.apps.card.v1.Suggestions\u00129\n\u0014auto_complete_action\u0018\b \u0001(\u000b2\u001b.google.apps.card.v1.Action\u0012\u0018\n\u0010placeholder_text\u0018\f \u0001(\t\"*\n\u0004Type\u0012\u000f\n\u000bSINGLE_LINE\u0010\u0000\u0012\u0011\n\rMULTIPLE_LINE\u0010\u0001\"z\n\u000bSuggestions\u0012>\n\u0005items\u0018\u0001 \u0003(\u000b2/.google.apps.card.v1.Suggestions.SuggestionItem\u001a+\n\u000eSuggestionItem\u0012\u000e\n\u0004text\u0018\u0001 \u0001(\tH\u0000B\t\n\u0007content\":\n\nButtonList\u0012,\n\u0007buttons\u0018\u0001 \u0003(\u000b2\u001b.google.apps.card.v1.Button\"ë\u0006\n\u000eSelectionInput\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005label\u0018\u0002 \u0001(\t\u0012?\n\u0004type\u0018\u0003 \u0001(\u000e21.google.apps.card.v1.SelectionInput.SelectionType\u0012@\n\u0005items\u0018\u0004 \u0003(\u000b21.google.apps.card.v1.SelectionInput.SelectionItem\u00125\n\u0010on_change_action\u0018\u0005 \u0001(\u000b2\u001b.google.apps.card.v1.Action\u0012'\n\u001fmulti_select_max_selected_items\u0018\u0006 \u0001(\u0005\u0012%\n\u001dmulti_select_min_query_length\u0018\u0007 \u0001(\u0005\u0012;\n\u0014external_data_source\u0018\b \u0001(\u000b2\u001b.google.apps.card.v1.ActionH\u0000\u0012V\n\u0014platform_data_source\u0018\t \u0001(\u000b26.google.apps.card.v1.SelectionInput.PlatformDataSourceH\u0000\u001ak\n\rSelectionItem\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u0012\u0010\n\bselected\u0018\u0003 \u0001(\b\u0012\u0016\n\u000estart_icon_uri\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bbottom_text\u0018\u0005 \u0001(\t\u001aµ\u0001\n\u0012PlatformDataSource\u0012e\n\u0012common_data_source\u0018\u0001 \u0001(\u000e2G.google.apps.card.v1.SelectionInput.PlatformDataSource.CommonDataSourceH\u0000\")\n\u0010CommonDataSource\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004USER\u0010\u0001B\r\n\u000bdata_source\"\\\n\rSelectionType\u0012\r\n\tCHECK_BOX\u0010\u0000\u0012\u0010\n\fRADIO_BUTTON\u0010\u0001\u0012\n\n\u0006SWITCH\u0010\u0002\u0012\f\n\bDROPDOWN\u0010\u0003\u0012\u0010\n\fMULTI_SELECT\u0010\u0004B\u001a\n\u0018multi_select_data_source\"§\u0002\n\u000eDateTimePicker\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005label\u0018\u0002 \u0001(\t\u0012D\n\u0004type\u0018\u0003 \u0001(\u000e26.google.apps.card.v1.DateTimePicker.DateTimePickerType\u0012\u0016\n\u000evalue_ms_epoch\u0018\u0004 \u0001(\u0003\u0012\u001c\n\u0014timezone_offset_date\u0018\u0005 \u0001(\u0005\u00125\n\u0010on_change_action\u0018\u0006 \u0001(\u000b2\u001b.google.apps.card.v1.Action\"E\n\u0012DateTimePickerType\u0012\u0011\n\rDATE_AND_TIME\u0010\u0000\u0012\r\n\tDATE_ONLY\u0010\u0001\u0012\r\n\tTIME_ONLY\u0010\u0002\"¶\u0001\n\u0006Button\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\u0012'\n\u0004icon\u0018\u0002 \u0001(\u000b2\u0019.google.apps.card.v1.Icon\u0012!\n\u0005color\u0018\u0003 \u0001(\u000b2\u0012.google.type.Color\u0012.\n\bon_click\u0018\u0004 \u0001(\u000b2\u001c.google.apps.card.v1.OnClick\u0012\u0010\n\bdisabled\u0018\u0005 \u0001(\b\u0012\u0010\n\balt_text\u0018\u0006 \u0001(\t\"Â\u0001\n\u0004Icon\u0012\u0014\n\nknown_icon\u0018\u0001 \u0001(\tH\u0000\u0012\u0012\n\bicon_url\u0018\u0002 \u0001(\tH\u0000\u0012:\n\rmaterial_icon\u0018\u0005 \u0001(\u000b2!.google.apps.card.v1.MaterialIconH\u0000\u0012\u0010\n\balt_text\u0018\u0003 \u0001(\t\u00129\n\nimage_type\u0018\u0004 \u0001(\u000e2%.google.apps.card.v1.Widget.ImageTypeB\u0007\n\u0005icons\"I\n\fMaterialIcon\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\f\n\u0004fill\u0018\u0002 \u0001(\b\u0012\u000e\n\u0006weight\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005grade\u0018\u0004 \u0001(\u0005\"Ú\u0001\n\u000eImageCropStyle\u0012?\n\u0004type\u0018\u0001 \u0001(\u000e21.google.apps.card.v1.ImageCropStyle.ImageCropType\u0012\u0014\n\faspect_ratio\u0018\u0002 \u0001(\u0001\"q\n\rImageCropType\u0012\u001f\n\u001bIMAGE_CROP_TYPE_UNSPECIFIED\u0010\u0000\u0012\n\n\u0006SQUARE\u0010\u0001\u0012\n\n\u0006CIRCLE\u0010\u0002\u0012\u0014\n\u0010RECTANGLE_CUSTOM\u0010\u0003\u0012\u0011\n\rRECTANGLE_4_3\u0010\u0004\"Ï\u0001\n\u000bBorderStyle\u00129\n\u0004type\u0018\u0001 \u0001(\u000e2+.google.apps.card.v1.BorderStyle.BorderType\u0012(\n\fstroke_color\u0018\u0002 \u0001(\u000b2\u0012.google.type.Color\u0012\u0015\n\rcorner_radius\u0018\u0003 \u0001(\u0005\"D\n\nBorderType\u0012\u001b\n\u0017BORDER_TYPE_UNSPECIFIED\u0010\u0000\u0012\r\n\tNO_BORDER\u0010\u0001\u0012\n\n\u0006STROKE\u0010\u0002\"¦\u0001\n\u000eImageComponent\u0012\u0011\n\timage_uri\u0018\u0001 \u0001(\t\u0012\u0010\n\balt_text\u0018\u0002 \u0001(\t\u00127\n\ncrop_style\u0018\u0003 \u0001(\u000b2#.google.apps.card.v1.ImageCropStyle\u00126\n\fborder_style\u0018\u0004 \u0001(\u000b2 .google.apps.card.v1.BorderStyle\"Ë\u0003\n\u0004Grid\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u00121\n\u0005items\u0018\u0002 \u0003(\u000b2\".google.apps.card.v1.Grid.GridItem\u00126\n\fborder_style\u0018\u0003 \u0001(\u000b2 .google.apps.card.v1.BorderStyle\u0012\u0014\n\fcolumn_count\u0018\u0004 \u0001(\u0005\u0012.\n\bon_click\u0018\u0005 \u0001(\u000b2\u001c.google.apps.card.v1.OnClick\u001a\u0082\u0002\n\bGridItem\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u00122\n\u0005image\u0018\u0002 \u0001(\u000b2#.google.apps.card.v1.ImageComponent\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u0010\n\bsubtitle\u0018\u0004 \u0001(\t\u0012A\n\u0006layout\u0018\t \u0001(\u000e21.google.apps.card.v1.Grid.GridItem.GridItemLayout\"R\n\u000eGridItemLayout\u0012 \n\u001cGRID_ITEM_LAYOUT_UNSPECIFIED\u0010\u0000\u0012\u000e\n\nTEXT_BELOW\u0010\u0001\u0012\u000e\n\nTEXT_ABOVE\u0010\u0002\"ý\u0007\n\u0007Columns\u00129\n\fcolumn_items\u0018\u0002 \u0003(\u000b2#.google.apps.card.v1.Columns.Column\u001a¶\u0007\n\u0006Column\u0012V\n\u0015horizontal_size_style\u0018\u0001 \u0001(\u000e27.google.apps.card.v1.Columns.Column.HorizontalSizeStyle\u0012M\n\u0014horizontal_alignment\u0018\u0002 \u0001(\u000e2/.google.apps.card.v1.Widget.HorizontalAlignment\u0012Q\n\u0012vertical_alignment\u0018\u0003 \u0001(\u000e25.google.apps.card.v1.Columns.Column.VerticalAlignment\u0012<\n\u0007widgets\u0018\u0004 \u0003(\u000b2+.google.apps.card.v1.Columns.Column.Widgets\u001a©\u0003\n\u0007Widgets\u0012<\n\u000etext_paragraph\u0018\u0001 \u0001(\u000b2\".google.apps.card.v1.TextParagraphH\u0000\u0012+\n\u0005image\u0018\u0002 \u0001(\u000b2\u001a.google.apps.card.v1.ImageH\u0000\u0012<\n\u000edecorated_text\u0018\u0003 \u0001(\u000b2\".google.apps.card.v1.DecoratedTextH\u0000\u00126\n\u000bbutton_list\u0018\u0004 \u0001(\u000b2\u001f.google.apps.card.v1.ButtonListH\u0000\u00124\n\ntext_input\u0018\u0005 \u0001(\u000b2\u001e.google.apps.card.v1.TextInputH\u0000\u0012>\n\u000fselection_input\u0018\u0006 \u0001(\u000b2#.google.apps.card.v1.SelectionInputH\u0000\u0012?\n\u0010date_time_picker\u0018\u0007 \u0001(\u000b2#.google.apps.card.v1.DateTimePickerH\u0000B\u0006\n\u0004data\"n\n\u0013HorizontalSizeStyle\u0012%\n!HORIZONTAL_SIZE_STYLE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014FILL_AVAILABLE_SPACE\u0010\u0001\u0012\u0016\n\u0012FILL_MINIMUM_SPACE\u0010\u0002\"X\n\u0011VerticalAlignment\u0012\"\n\u001eVERTICAL_ALIGNMENT_UNSPECIFIED\u0010\u0000\u0012\n\n\u0006CENTER\u0010\u0001\u0012\u0007\n\u0003TOP\u0010\u0002\u0012\n\n\u0006BOTTOM\u0010\u0003\"à\u0001\n\u0007OnClick\u0012-\n\u0006action\u0018\u0001 \u0001(\u000b2\u001b.google.apps.card.v1.ActionH\u0000\u00122\n\topen_link\u0018\u0002 \u0001(\u000b2\u001d.google.apps.card.v1.OpenLinkH\u0000\u0012?\n\u0018open_dynamic_link_action\u0018\u0003 \u0001(\u000b2\u001b.google.apps.card.v1.ActionH\u0000\u0012)\n\u0004card\u0018\u0004 \u0001(\u000b2\u0019.google.apps.card.v1.CardH\u0000B\u0006\n\u0004data\"Ñ\u0001\n\bOpenLink\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u00125\n\u0007open_as\u0018\u0002 \u0001(\u000e2$.google.apps.card.v1.OpenLink.OpenAs\u00127\n\bon_close\u0018\u0003 \u0001(\u000e2%.google.apps.card.v1.OpenLink.OnClose\"$\n\u0006OpenAs\u0012\r\n\tFULL_SIZE\u0010\u0000\u0012\u000b\n\u0007OVERLAY\u0010\u0001\"\"\n\u0007OnClose\u0012\u000b\n\u0007NOTHING\u0010\u0000\u0012\n\n\u0006RELOAD\u0010\u0001\"\u0088\u0003\n\u0006Action\u0012\u0010\n\bfunction\u0018\u0001 \u0001(\t\u0012?\n\nparameters\u0018\u0002 \u0003(\u000b2+.google.apps.card.v1.Action.ActionParameter\u0012A\n\u000eload_indicator\u0018\u0003 \u0001(\u000e2).google.apps.card.v1.Action.LoadIndicator\u0012\u0016\n\u000epersist_values\u0018\u0004 \u0001(\b\u0012<\n\u000binteraction\u0018\u0005 \u0001(\u000e2'.google.apps.card.v1.Action.Interaction\u001a-\n\u000fActionParameter\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\"&\n\rLoadIndicator\u0012\u000b\n\u0007SPINNER\u0010\u0000\u0012\b\n\u0004NONE\u0010\u0001\";\n\u000bInteraction\u0012\u001b\n\u0017INTERACTION_UNSPECIFIED\u0010\u0000\u0012\u000f\n\u000bOPEN_DIALOG\u0010\u0001B¤\u0001\n\u0017com.google.apps.card.v1B\tCardProtoP\u0001Z7google.golang.org/genproto/googleapis/apps/card/v1;cardª\u0002\u0013Google.Apps.Card.V1Ê\u0002\u0013Google\\Apps\\Card\\V1ê\u0002\u0016Google::Apps::Card::V1b\u0006proto3"}, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Action_ActionParameter_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Action_ActionParameter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Action_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Action_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_BorderStyle_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_BorderStyle_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_ButtonList_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_ButtonList_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Button_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Button_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Card_CardAction_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Card_CardAction_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Card_CardFixedFooter_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Card_CardFixedFooter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Card_CardHeader_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Card_CardHeader_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Card_Section_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Card_Section_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Card_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Card_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Columns_Column_Widgets_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Columns_Column_Widgets_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Columns_Column_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Columns_Column_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Columns_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Columns_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_DateTimePicker_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_DateTimePicker_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_DecoratedText_SwitchControl_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_DecoratedText_SwitchControl_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_DecoratedText_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_DecoratedText_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Divider_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Divider_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Grid_GridItem_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Grid_GridItem_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Grid_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Grid_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Icon_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Icon_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_ImageComponent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_ImageComponent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_ImageCropStyle_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_ImageCropStyle_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Image_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Image_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_MaterialIcon_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_OnClick_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_OnClick_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_OpenLink_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_SelectionInput_SelectionItem_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_SelectionInput_SelectionItem_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_SelectionInput_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_SelectionInput_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Suggestions_SuggestionItem_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Suggestions_SuggestionItem_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Suggestions_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Suggestions_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_TextInput_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_TextInput_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_TextParagraph_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_TextParagraph_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_apps_card_v1_Widget_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_apps_card_v1_Widget_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private CardProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_apps_card_v1_Card_descriptor = descriptor2;
        internal_static_google_apps_card_v1_Card_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Header", "Sections", "SectionDividerStyle", "CardActions", "Name", "FixedFooter", "DisplayStyle", "PeekCardHeader"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Card_CardHeader_descriptor = descriptor3;
        internal_static_google_apps_card_v1_Card_CardHeader_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Title", "Subtitle", "ImageType", "ImageUrl", "ImageAltText"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_google_apps_card_v1_Card_Section_descriptor = descriptor4;
        internal_static_google_apps_card_v1_Card_Section_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Header", "Widgets", "Collapsible", "UncollapsibleWidgetsCount"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        internal_static_google_apps_card_v1_Card_CardAction_descriptor = descriptor5;
        internal_static_google_apps_card_v1_Card_CardAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ActionLabel", "OnClick"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        internal_static_google_apps_card_v1_Card_CardFixedFooter_descriptor = descriptor6;
        internal_static_google_apps_card_v1_Card_CardFixedFooter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"PrimaryButton", "SecondaryButton"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_apps_card_v1_Widget_descriptor = descriptor7;
        internal_static_google_apps_card_v1_Widget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"TextParagraph", "Image", "DecoratedText", "ButtonList", "TextInput", "SelectionInput", "DateTimePicker", "Divider", "Grid", "Columns", "HorizontalAlignment", "Data"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_apps_card_v1_TextParagraph_descriptor = descriptor8;
        internal_static_google_apps_card_v1_TextParagraph_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Text"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_apps_card_v1_Image_descriptor = descriptor9;
        internal_static_google_apps_card_v1_Image_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ImageUrl", "OnClick", "AltText"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_apps_card_v1_Divider_descriptor = descriptor10;
        internal_static_google_apps_card_v1_Divider_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[0]);
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_apps_card_v1_DecoratedText_descriptor = descriptor11;
        internal_static_google_apps_card_v1_DecoratedText_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Icon", "StartIcon", "TopLabel", "Text", "WrapText", "BottomLabel", "OnClick", "Button", "SwitchControl", "EndIcon", "Control"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_DecoratedText_SwitchControl_descriptor = descriptor12;
        internal_static_google_apps_card_v1_DecoratedText_SwitchControl_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Name", "Value", "Selected", "OnChangeAction", "ControlType"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_apps_card_v1_TextInput_descriptor = descriptor13;
        internal_static_google_apps_card_v1_TextInput_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Name", "Label", "HintText", "Value", "Type", "OnChangeAction", "InitialSuggestions", "AutoCompleteAction", "PlaceholderText"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_apps_card_v1_Suggestions_descriptor = descriptor14;
        internal_static_google_apps_card_v1_Suggestions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Items"});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Suggestions_SuggestionItem_descriptor = descriptor15;
        internal_static_google_apps_card_v1_Suggestions_SuggestionItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Text", "Content"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(8);
        internal_static_google_apps_card_v1_ButtonList_descriptor = descriptor16;
        internal_static_google_apps_card_v1_ButtonList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Buttons"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(9);
        internal_static_google_apps_card_v1_SelectionInput_descriptor = descriptor17;
        internal_static_google_apps_card_v1_SelectionInput_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Name", "Label", "Type", "Items", "OnChangeAction", "MultiSelectMaxSelectedItems", "MultiSelectMinQueryLength", "ExternalDataSource", "PlatformDataSource", "MultiSelectDataSource"});
        Descriptors.Descriptor descriptor18 = descriptor17.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_SelectionInput_SelectionItem_descriptor = descriptor18;
        internal_static_google_apps_card_v1_SelectionInput_SelectionItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Text", "Value", "Selected", "StartIconUri", "BottomText"});
        Descriptors.Descriptor descriptor19 = descriptor17.getNestedTypes().get(1);
        internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_descriptor = descriptor19;
        internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"CommonDataSource", "DataSource"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(10);
        internal_static_google_apps_card_v1_DateTimePicker_descriptor = descriptor20;
        internal_static_google_apps_card_v1_DateTimePicker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Name", "Label", "Type", "ValueMsEpoch", "TimezoneOffsetDate", "OnChangeAction"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(11);
        internal_static_google_apps_card_v1_Button_descriptor = descriptor21;
        internal_static_google_apps_card_v1_Button_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Text", "Icon", "Color", "OnClick", "Disabled", "AltText"});
        Descriptors.Descriptor descriptor22 = getDescriptor().getMessageTypes().get(12);
        internal_static_google_apps_card_v1_Icon_descriptor = descriptor22;
        internal_static_google_apps_card_v1_Icon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"KnownIcon", "IconUrl", "MaterialIcon", "AltText", "ImageType", "Icons"});
        Descriptors.Descriptor descriptor23 = getDescriptor().getMessageTypes().get(13);
        internal_static_google_apps_card_v1_MaterialIcon_descriptor = descriptor23;
        internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Name", "Fill", "Weight", "Grade"});
        Descriptors.Descriptor descriptor24 = getDescriptor().getMessageTypes().get(14);
        internal_static_google_apps_card_v1_ImageCropStyle_descriptor = descriptor24;
        internal_static_google_apps_card_v1_ImageCropStyle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Type", "AspectRatio"});
        Descriptors.Descriptor descriptor25 = getDescriptor().getMessageTypes().get(15);
        internal_static_google_apps_card_v1_BorderStyle_descriptor = descriptor25;
        internal_static_google_apps_card_v1_BorderStyle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Type", "StrokeColor", "CornerRadius"});
        Descriptors.Descriptor descriptor26 = getDescriptor().getMessageTypes().get(16);
        internal_static_google_apps_card_v1_ImageComponent_descriptor = descriptor26;
        internal_static_google_apps_card_v1_ImageComponent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"ImageUri", "AltText", "CropStyle", "BorderStyle"});
        Descriptors.Descriptor descriptor27 = getDescriptor().getMessageTypes().get(17);
        internal_static_google_apps_card_v1_Grid_descriptor = descriptor27;
        internal_static_google_apps_card_v1_Grid_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"Title", "Items", "BorderStyle", "ColumnCount", "OnClick"});
        Descriptors.Descriptor descriptor28 = descriptor27.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Grid_GridItem_descriptor = descriptor28;
        internal_static_google_apps_card_v1_Grid_GridItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Id", "Image", "Title", "Subtitle", "Layout"});
        Descriptors.Descriptor descriptor29 = getDescriptor().getMessageTypes().get(18);
        internal_static_google_apps_card_v1_Columns_descriptor = descriptor29;
        internal_static_google_apps_card_v1_Columns_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"ColumnItems"});
        Descriptors.Descriptor descriptor30 = descriptor29.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Columns_Column_descriptor = descriptor30;
        internal_static_google_apps_card_v1_Columns_Column_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor30, new String[]{"HorizontalSizeStyle", "HorizontalAlignment", "VerticalAlignment", "Widgets"});
        Descriptors.Descriptor descriptor31 = descriptor30.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Columns_Column_Widgets_descriptor = descriptor31;
        internal_static_google_apps_card_v1_Columns_Column_Widgets_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor31, new String[]{"TextParagraph", "Image", "DecoratedText", "ButtonList", "TextInput", "SelectionInput", "DateTimePicker", "Data"});
        Descriptors.Descriptor descriptor32 = getDescriptor().getMessageTypes().get(19);
        internal_static_google_apps_card_v1_OnClick_descriptor = descriptor32;
        internal_static_google_apps_card_v1_OnClick_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor32, new String[]{"Action", "OpenLink", "OpenDynamicLinkAction", "Card", "Data"});
        Descriptors.Descriptor descriptor33 = getDescriptor().getMessageTypes().get(20);
        internal_static_google_apps_card_v1_OpenLink_descriptor = descriptor33;
        internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor33, new String[]{"Url", "OpenAs", "OnClose"});
        Descriptors.Descriptor descriptor34 = getDescriptor().getMessageTypes().get(21);
        internal_static_google_apps_card_v1_Action_descriptor = descriptor34;
        internal_static_google_apps_card_v1_Action_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor34, new String[]{"Function", "Parameters", "LoadIndicator", "PersistValues", "Interaction"});
        Descriptors.Descriptor descriptor35 = descriptor34.getNestedTypes().get(0);
        internal_static_google_apps_card_v1_Action_ActionParameter_descriptor = descriptor35;
        internal_static_google_apps_card_v1_Action_ActionParameter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor35, new String[]{"Key", "Value"});
        ColorProto.getDescriptor();
    }
}
